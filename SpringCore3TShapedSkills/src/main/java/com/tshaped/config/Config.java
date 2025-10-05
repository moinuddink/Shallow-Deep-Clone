package com.tshaped.config;

import com.tshaped.service.Password;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    public Config() {
        System.out.println("Config Bean Created");
    }

    @Bean
    public Password createPass()
    {
        return new Password("SHA");
    }
}
