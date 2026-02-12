package com.example.Thymeleaf.Demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.Thymeleaf.Demo.model.Fighter;
import com.example.Thymeleaf.Demo.service.FighterService;

@Controller
public class CreateFighterController {

    private final FighterService fighterService;

    public CreateFighterController(FighterService fighterService) {
        this.fighterService = fighterService;
    }

    // Show the create fighter form
    @GetMapping("/create-fighter")
    public String showCreateFighterForm(Model model) {
        model.addAttribute("fighter", new Fighter());
        return "create-fighter";
    }

    // Handle form submission
    @PostMapping("/create-fighter")
    public String submitForm(@ModelAttribute Fighter fighter) {
        // Add fighter to the service
        fighterService.addFighter(fighter);
        return "redirect:/fighters"; // Redirect to the fighters list
    }
}

