package com.example.Thymeleaf.Demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {

    @GetMapping("/")
    public String getHomePage(Model model){

        model.addAttribute("message", "Hello From Cpan 228 Java Code sent the text");
        return "Home";
    }
}
