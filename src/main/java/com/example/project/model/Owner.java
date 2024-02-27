package com.example.project.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Owner {

    private String type;

    private String taxIdNumber;

    private String name;
}
