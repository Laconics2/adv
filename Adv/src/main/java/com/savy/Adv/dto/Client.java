package com.savy.Adv.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import org.springframework.data.annotation.Id;

@Entity
@Table(name = "client")
public class Client {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String email;

    // getter, setters, contructors
}