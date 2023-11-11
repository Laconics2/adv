package com.savy.adv.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Document("playercharacters")
public class Character extends Entity{
    @Setter
    private CharacterClass characterClass;

    public Character(String id, String name, int healthPoints, int powerLevel, CharacterClass characterClass){
        super(id, name, healthPoints, powerLevel);
        this.characterClass = characterClass;
    }
}
