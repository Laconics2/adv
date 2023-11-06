package com.savy.adv.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Document("playercharacters")
public class Player extends Entity{
    @Setter
    private String playerClass;

    public Player(String id, String name, int healthPoints, int powerLevel, String playerClass){
        super(id, name, healthPoints, powerLevel);
        this.playerClass = playerClass;
    }
}
