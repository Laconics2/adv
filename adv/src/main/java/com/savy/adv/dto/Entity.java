package com.savy.adv.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;


@Data
@AllArgsConstructor
public class Entity {
    @Id
    @Setter
    private int id;
    @Setter
    private String name;
    @Setter
    private int healthPoints;
    @Setter
    private int powerLevel;
}
