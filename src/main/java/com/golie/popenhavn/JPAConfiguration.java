package com.golie.popenhavn;

import com.golie.popenhavn.services.ImageService;
import com.golie.popenhavn.services.ImageServiceImpl;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableAutoConfiguration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = { "com.golie.popenhavn.repositories" })
@ComponentScan("com.golie.popenhavn")
@PropertySource("classpath:application.properties")
public class JPAConfiguration {

    @Bean
    public ImageService imageService() {
        return new ImageServiceImpl();
    }
}