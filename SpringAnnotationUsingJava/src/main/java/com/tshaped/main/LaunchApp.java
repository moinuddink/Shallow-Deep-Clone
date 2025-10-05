package com.tshaped.main;

import com.tshaped.config.Config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LaunchApp {

    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(Config.class);

    }
}
