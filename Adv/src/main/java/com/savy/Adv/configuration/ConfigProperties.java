package com.savy.Adv.configuration;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.PersistenceContext;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ConfigurationProperties
@Configuration
@AutoConfiguration
public class ConfigProperties {
    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.savvy.Adv.client_catalog");

    public static EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
}
