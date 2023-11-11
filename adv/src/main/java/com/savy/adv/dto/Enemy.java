package com.savy.adv.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Document("enemycharacters")
public class Enemy extends Entity{
    @Setter
    private EnemyAttribute enemyAttribute;

    public Enemy(int id, String name, int healthPoints, int powerLevel, EnemyAttribute enemyAttribute){
        super(id, name, healthPoints, powerLevel);
        this.enemyAttribute = enemyAttribute;
    }
}
