package com.savy.adv.controllers;

import com.savy.adv.services.CharacterService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CharacterControllerTest {
    private CharacterService characterService;

    @BeforeAll
    protected void setup() {

    }

    @Test
    void CreateCharacterTest() {

    }
}
