package com.ultimateScrape.serviceRegistry.serviceRegistry;

import org.example.ModuleConfigurationApp;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ModuleConfigurationApp.class})
public class AppConfig { }
