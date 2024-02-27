package com.example.project.controller;

import com.example.project.model.Key;
import com.example.project.model.Owner;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class GreetingController {

    Owner personalData = new Owner("NATURAL_PERSON", "29640751820", "Alexandre Mota");

    Key myKey = new Key("+5511976888251", "PHONE", personalData);


    @GetMapping("/key")
    public Key getKey() {
        return myKey;
    }
}
