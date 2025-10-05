package com.tshaped.service;

import org.springframework.context.annotation.Bean;

public class Password {

    String algo;

    public Password(String algo) {
        System.out.println("Passwrod Bean created");
        this.algo = algo;
    }

    @Bean
    public String aboutAlgo() {
        return "Algo used is"+algo;
    }
}
