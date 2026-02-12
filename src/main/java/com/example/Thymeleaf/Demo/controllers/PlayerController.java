package com.example.Thymeleaf.Demo.controllers;

import com.example.Thymeleaf.Demo.model.Player;
import com.example.Thymeleaf.Demo.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PlayerController {

    @Autowired
    private PlayerService playerService; // <-- inject service

    @GetMapping("/players")
    public String getPlayers(Model model) {
        model.addAttribute("players", playerService.getAllPlayers());
        return "players"; // players.html
    }

    @PostMapping("/players")
    public String addPlayer(
            @RequestParam String firstName,
            @RequestParam String lastName,
            @RequestParam String email
    ) {
        // id is handled by service
        playerService.addPlayer(new Player(0, firstName, lastName, email));
        return "redirect:/players";
    }

    @GetMapping("/add-player")
    public String addPlayerForm() {
        return "add-player"; // add-player.html
    }
}
