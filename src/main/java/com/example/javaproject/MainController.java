package com.example.javaproject;

import org.springframework.web.bind.annotation.GetMapping;
public class MainController {
    @GetMapping("")
    public String showHomePage() {
        return "index";
    }
}

