package com.example.exospring.controller;

import com.example.exospring.entities.Library;
import com.example.exospring.entities.Manga;
import com.example.exospring.models.forms.LibraryForm;
import com.example.exospring.repositories.LibraryRepository;
import com.example.exospring.services.LibraryService;
import com.example.exospring.services.MangaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class LibraryController {
    private final LibraryService service;
    private final MangaService mangaService;

    public LibraryController(LibraryService service, MangaService mangaService){
        this.service = service;
        this.mangaService = mangaService;
    }

    @GetMapping(path = {"/addLibrary"})
    public String getLibrary(Model model){
        List<Library> libraries = service.findAll();

        List<Manga> mangas = mangaService.findAll();

        model.addAttribute("libraries", libraries);
        model.addAttribute("mangas", mangas);
        return "model/addLibrary";
    }

    @PostMapping(path = {"/addLibrary"})
    public String postlibrary(LibraryForm form){
        Library toInsert = new Library();
        toInsert.setName(form.getName());
        if (!form.getMangas().isEmpty()){
            toInsert.setMangas(form.getMangas());
        }
        service.insert(toInsert);

        return "redirect:/addLibrary";
    }



}
