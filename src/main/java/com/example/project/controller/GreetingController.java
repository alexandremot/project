package com.example.project.controller;

import com.example.project.model.Greetings;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class GreetingController {

    Greetings greetings = new Greetings("Hello world");
    
    @GetMapping("/hello")
    public Greetings greeting() {
        return greetings;
    }
}
