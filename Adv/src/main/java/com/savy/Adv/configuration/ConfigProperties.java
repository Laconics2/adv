package com.savy.Adv.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.savy.Adv.repositories")
@ConfigurationProperties
@Configuration
public class ConfigProperties {
}
