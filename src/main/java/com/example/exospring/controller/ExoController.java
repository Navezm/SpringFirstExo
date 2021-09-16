package com.example.exospring.controller;

import com.example.exospring.entities.Article;
import com.example.exospring.entities.Manga;
import com.example.exospring.entities.Person;
import com.example.exospring.services.ArticleService;
import com.example.exospring.services.MangaService;
import com.example.exospring.services.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ExoController {
    private final PersonService personService;
    private final ArticleService articleService;
    private final MangaService mangaService;

    public ExoController(PersonService personService, ArticleService articleService, MangaService mangaService){
        this.personService = personService;
        this.articleService = articleService;
        this.mangaService = mangaService;
    }

    @GetMapping(path = {"", "/"})
    public String homeAction(Model model) {
        List<Person> persons = personService.findAll();

        Person person = personService.findByName("Navez");

        List<Manga> mangas = mangaService.findAll();

        model.addAttribute("persons", persons);
        model.addAttribute("person", person);
        model.addAttribute("mangas", mangas);

        return "model/home";
    }

    @GetMapping(path = {"/article"})
    public String articleAction(Model model) {
        List<Article> articles = articleService.findAll();

        List<Article> articlesByAuthor = articleService.findByAuthor(2L);

        model.addAttribute("articles", articles);
        model.addAttribute("articlesAuthor", articlesByAuthor);

        return "model/article";
    }

}
