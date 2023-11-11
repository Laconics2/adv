package com.savy.adv.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Document("playercharacters")
public class PlayerCharacter extends Entity{
    @Setter
    private CharacterClass characterClass;

    public PlayerCharacter(int id, String name, int healthPoints, int powerLevel, CharacterClass characterClass){
        super(id, name, healthPoints, powerLevel);
        this.characterClass = characterClass;
    }
}
