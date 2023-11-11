package com.savy.adv.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateCharacterRequest {
    private String name;
    private CharacterClass characterClass;
}
