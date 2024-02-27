package com.example.project.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Key {

    private String keyValue;

    private String keyType;

    private Owner owner;

}
