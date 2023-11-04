package com.savy.Adv;

import com.savy.Adv.configuration.ConfigProperties;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@EnableConfigurationProperties(ConfigProperties.class)
public class SavyAdvApplication {

	public static void main(String[] args) {
		SpringApplication.run(SavyAdvApplication.class, args);
	}

}
