package com.telusko.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    public Config() {
        System.out.println("Config bean created");
    }

    @Bean
    public Password createPassword() {
        Password pass = new Password("SHA");
        return pass;
    }
}
