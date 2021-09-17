package com.example.exospring.controller;

import com.example.exospring.entities.Library;
import com.example.exospring.entities.Manga;
import com.example.exospring.entities.Mangakana;
import com.example.exospring.models.forms.MangaForm;
import com.example.exospring.services.LibraryService;
import com.example.exospring.services.MangaService;
import com.example.exospring.services.MangakanaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class MangaController {
    private final MangaService mangaService;
    private final MangakanaService mangakanaService;
    private final LibraryService libraryService;

    public MangaController(MangaService mangaService, MangakanaService mangakanaService, LibraryService libraryService) {
        this.mangaService = mangaService;
        this.mangakanaService = mangakanaService;
        this.libraryService = libraryService;
    }

    @GetMapping(path = {"/", ""})
    public String homeAction(Model model){
        List<Manga> mangas = mangaService.findAll();

        List<Mangakana> mangakanas = mangakanaService.findAll();

        Map<Manga, List<Mangakana>> map = new HashMap<>();
        for(Manga manga: mangas) {
            map.put(manga, mangakanaService.findAllByManga(manga));
        }

        model.addAttribute("mangas", mangas);
        model.addAttribute("mangakanas", mangakanas);
        model.addAttribute("map", map);
        return "model/home";
    }

    @GetMapping(path = {"/create"})
    public String createAction(Model model){
        List<Library> libraries = libraryService.findAll();

        model.addAttribute("libraries", libraries);

        return "model/create";
    }

    @PostMapping(path = {"/create"})
    public String createAction(MangaForm mangaForm){
        Manga toInsert = new Manga();
        toInsert.setTitle(mangaForm.getTitle());
        toInsert.setGenre(mangaForm.getGenre());
        toInsert.setImgSrc(mangaForm.getImgSrc());

        mangaService.insert(toInsert);
        return "redirect:/create";
    }

}
