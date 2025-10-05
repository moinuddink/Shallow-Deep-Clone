package com.tshaped.config;

import com.tshaped.service.Password;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.tshaped"})
public class Config {

    public Config() {
        System.out.println("Config Bean Created");
    }
    public Password createPass()
    {
        return new Password("SHA");
    }


}
