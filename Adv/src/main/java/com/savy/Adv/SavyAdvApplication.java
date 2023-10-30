package com.savy.Adv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class SavyAdvApplication {

	public static void main(String[] args) {
		SpringApplication.run(SavyAdvApplication.class, args);
	}

}
