package com.example.thymeleaftest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

@Controller
public class WeekdayController {
    @GetMapping("weekday")
    String getDayOfWeek(Model model){
        Locale locale = new Locale("da","DK");
        LocalDate date = LocalDate.now();
        DayOfWeek dayOfWeek = date.getDayOfWeek();

        model.addAttribute("day", "Idag er " + dayOfWeek.getDisplayName(TextStyle.FULL, locale) + ", dato: " + date);
        return "weekday";
    }

    @GetMapping("isFriday")
    String isFriday(Model model){
        LocalDate date = LocalDate.now();
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        model.addAttribute("day", dayOfWeek);
        return "weekday";
    }
}
