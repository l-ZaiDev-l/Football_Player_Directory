package com.example.footballdirectory.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MatchesController {

    @GetMapping("/matches")
    public String MatchesController(Model model) {
        // Add attributes to the model as needed
        return "matches";
    }
}
