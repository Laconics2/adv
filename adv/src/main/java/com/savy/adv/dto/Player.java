package com.savy.adv.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("playercharacters")
public class Player {
    @Id
    @Setter @Getter
    private String id;

    @Getter @Setter
    private String name;
    @Getter @Setter
    private int healthPoints;
    @Getter @Setter
    private int powerLevel;
    @Getter @Setter
    private String playerClass;

    public Player(String id, String name, int healthPoints, int powerLevel, String playerClass){
        super();
        this.id = id;
        this.name = name;
        this.healthPoints = healthPoints;
        this.playerClass = playerClass;
    }
}
