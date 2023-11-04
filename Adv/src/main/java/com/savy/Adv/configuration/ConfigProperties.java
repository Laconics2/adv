package com.savy.Adv.configuration;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.savy.Adv.repositories")
@ConfigurationProperties
@Configuration
@AutoConfiguration
public class ConfigProperties {
    @PersistenceContext
    EntityManager entityManager;
}
