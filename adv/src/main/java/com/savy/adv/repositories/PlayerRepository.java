package com.savy.adv.repositories;

import com.savy.adv.dto.Player;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface PlayerRepository extends MongoRepository<Player, String> {
    @Query("{name: '?0'}")
    Player findItemsByName(String name);

    @Query(value = "{playerClass: '?0'}", fields = "{'name' : 1, 'quantity' : 1}")
    List<Player> findAll(String playerClass);

    public long count();
}
