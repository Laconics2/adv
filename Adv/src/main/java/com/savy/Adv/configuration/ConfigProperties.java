package com.savy.Adv.configuration;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ConfigurationProperties
@Configuration
@EnableJpaRepositories
public class ConfigProperties {
    @PersistenceUnit(name = "HypersistenceOptimizer")
    private EntityManagerFactory entityManagerFactory;

}
