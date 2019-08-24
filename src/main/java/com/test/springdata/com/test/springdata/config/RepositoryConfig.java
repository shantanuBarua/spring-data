package com.test.springdata.com.test.springdata.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.test.springdata")
public class RepositoryConfig {
}