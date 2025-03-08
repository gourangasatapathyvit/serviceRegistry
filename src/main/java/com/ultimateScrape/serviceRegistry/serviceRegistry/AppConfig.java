package com.ultimateScrape.serviceRegistry.serviceRegistry;

import org.example.ModuleConfigurationApp;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import java.util.Arrays;
import java.util.List;

@Configuration
@Import({ModuleConfigurationApp.class})
public class AppConfig {

    @Value("${allowed.origins}")
    private String allowedOrigins;

    @Bean
    public List<String> allowedOrigins() {
        return Arrays.asList(allowedOrigins.split(","));
    }

}
