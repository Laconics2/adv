package com.savy.adv.controllers;

import com.savy.adv.dto.CharacterClass;
import com.savy.adv.dto.CreateCharacterRequest;
import com.savy.adv.dto.PlayerCharacter;
import com.savy.adv.services.CharacterService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class CharacterController {
    // the class that can be used to create a character
    public final CharacterService characterService;

    @PostMapping("/character/create")
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public PlayerCharacter createCharacter(@RequestBody CreateCharacterRequest createCharacterRequest) {
        return characterService.createCharacter(createCharacterRequest.getName(), createCharacterRequest.getCharacterClass());
    }
}
