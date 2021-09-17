package com.example.Authdemo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/api/resources")
    public String showListOfResources() {
        return "All okay!";
    }
}
