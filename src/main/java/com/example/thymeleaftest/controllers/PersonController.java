package com.example.thymeleaftest.controllers;

import com.example.thymeleaftest.model.Person;
import com.example.thymeleaftest.services.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class PersonController {

    PersonService personService;

    public PersonController(PersonService personService){
        this.personService = personService;
    }

    @GetMapping("/")
    String getPeople(Model model){
        model.addAttribute("something", "this is coming from the controller");
        model.addAttribute("people", Arrays.asList(
                new Person("Anders Teller",20),
                new Person("Nicolai Andersson", 38),
                new Person("Victor Hanert",14)));
        return "people";
    }

    @GetMapping("findAll")
    String findAll(Model model){
        List<Person> persons = personService.getPersons();
        model.addAttribute("persons", persons);
        return "people";
    }
}
