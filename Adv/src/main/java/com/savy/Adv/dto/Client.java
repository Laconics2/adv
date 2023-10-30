package com.savy.Adv.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import lombok.*;
import org.springframework.data.annotation.Id;

@Getter
@Entity
@Table(name = "client")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Client {

    @Id
    @GeneratedValue
    @Setter private Long id;

    @Setter private String name;
    @Setter private String email;

    // getter, setters, contructors
}