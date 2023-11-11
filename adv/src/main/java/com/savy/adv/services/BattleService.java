package com.savy.adv.services;

import com.savy.adv.dto.Enemy;
import com.savy.adv.dto.Entity;
import com.savy.adv.dto.PlayerCharacter;
import com.savy.adv.dto.CharacterClass;

public class BattleService {
    //Controls the battle sequences, include random number generator for attack dmg
    // controls HP deductions and additions
    public Entity battle(PlayerCharacter characterPlayerCharacter, Enemy enemyCharacter){
        // takes in two characters and compares them and returns the "winner"
        // what about round based? If you just compare to characters you can't continue a fight if you die???
        return new PlayerCharacter(1, "", 0, 12, CharacterClass.CLERIC);
    }
}
