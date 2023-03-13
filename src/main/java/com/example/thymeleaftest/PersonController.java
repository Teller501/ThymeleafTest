package com.example.thymeleaftest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;

@Controller
public class PersonController {

    @GetMapping("/")
    String getPeople(Model model){
        model.addAttribute("something", "this is coming from the controller");
        model.addAttribute("people", Arrays.asList(
                new Person("Anders Teller",20),
                new Person("Nicolai Andersson", 38),
                new Person("Victor Hanert",14)));
        return "people";
    }
}
