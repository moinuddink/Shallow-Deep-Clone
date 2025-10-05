package com.telusko.main;

import com.telusko.configuration.Password;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaunchApp {
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("applicationconfig.xml");

      Password p =  container.getBean(Password.class);

        System.out.println("Alog used is "+p.getAlgo());
    }
}
