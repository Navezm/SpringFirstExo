package com.example.exospring.controller;

import com.example.exospring.services.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExoController {
    private final PersonService personService;

    public ExoController(PersonService personService){ this.personService = personService; }

    @GetMapping(path = {"", "/"})
    public String homeAction(Model model) {

        return null;
    }

}
