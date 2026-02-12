package com.example.Thymeleaf.Demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutController {

    @GetMapping("/about") // matches navbar link th:href="@{/about}"
    public String about() {
        return "about"; // renders about.html
    }
}
