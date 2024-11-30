package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Welcome to My Web App");
        model.addAttribute("message", "Hello my name is Raman Khanna!");
        return "index"; // Refers to 'index.html' in the templates folder
    }
}
