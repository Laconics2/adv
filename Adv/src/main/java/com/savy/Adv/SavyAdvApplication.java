package com.savy.Adv;

import com.savy.Adv.configuration.ConfigProperties;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@EnableConfigurationProperties(ConfigProperties.class)
@EnableJpaRepositories
public class SavyAdvApplication {

	public static void main(String[] args) {
		SpringApplication.run(SavyAdvApplication.class, args);
	}

}
