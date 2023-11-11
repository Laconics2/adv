package com.savy.adv.repositories;

import com.savy.adv.dto.PlayerCharacter;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface PlayerRepository extends MongoRepository<PlayerCharacter, String> {
    @Query("{name: '?0'}")
    PlayerCharacter findItemsByName(String name);

    @Query(value = "{playerClass: '?0'}", fields = "{'name' : 1, 'quantity' : 1}")
    List<PlayerCharacter> findAll(String playerClass);

    public long count();
}
