package com.savy.adv.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@AllArgsConstructor
public class Entity {
    @Id
    @Setter
    private String id;
    @Setter
    private String name;
    @Setter
    private int healthPoints;
    @Setter
    private int powerLevel;
}
