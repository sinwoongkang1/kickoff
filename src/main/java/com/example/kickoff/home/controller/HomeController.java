package com.example.kickoff.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/kickoff")
    public String home() {
        return "home";
    }
}
