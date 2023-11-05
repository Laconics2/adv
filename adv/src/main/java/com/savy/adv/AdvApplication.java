package com.savy.adv;

import com.savy.adv.repositories.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class AdvApplication {
	@Autowired
	PlayerRepository playerCharacterRepo;

	public static void main(String[] args) {
		SpringApplication.run(AdvApplication.class, args);
	}

}
