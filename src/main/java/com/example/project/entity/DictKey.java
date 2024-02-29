package com.example.project.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "dict")
public class DictKey {

    @Id
    private String keyValue;

    private String keyType;

    private Integer ownerId;
}
