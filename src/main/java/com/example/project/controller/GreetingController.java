package com.example.project.controller;

import com.example.project.entity.DictKey;
import com.example.project.repository.DictKeyRepository;
import com.example.project.service.DictKeyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class GreetingController {

    private final DictKeyService dictKeyService;

    @Autowired
    public GreetingController(DictKeyService dictKeyService) {
        this.dictKeyService = dictKeyService;
    }

    @GetMapping("/keys")
    public List<DictKey> getAllDictKeys() {
        return dictKeyService.getAllDictKeys();
    }
}
