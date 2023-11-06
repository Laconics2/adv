package com.savy.adv.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Document("enemycharacters")
public class Enemy extends Entity{
    @Setter
    private String elementClass;

    public Enemy(String id, String name, int healthPoints, int powerLevel, String playerClass){
        super(id, name, healthPoints, powerLevel);
        this.elementClass = playerClass;
    }
}
