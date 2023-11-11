package com.savy.adv.services;

import com.savy.adv.dto.CharacterClass;
import org.springframework.stereotype.Service;
import com.savy.adv.dto.PlayerCharacter;

@Service
public class CharacterService {
    // service that can control characters

    public PlayerCharacter createCharacter(String name, CharacterClass characterClass) {
        return new PlayerCharacter(1, name, 20, 10, characterClass);
    }

}
