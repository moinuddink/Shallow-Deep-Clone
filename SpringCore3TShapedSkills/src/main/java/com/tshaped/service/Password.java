package com.tshaped.service;


import org.springframework.context.annotation.Bean;

public class Password {

    String algo;
    public Password(String algo) {
        this.algo=algo;
        System.out.println("Password Bean created");
    }

    @Bean
    public String aboutAlgo()
    {
        return "Algo used is"+algo;
    }
}
