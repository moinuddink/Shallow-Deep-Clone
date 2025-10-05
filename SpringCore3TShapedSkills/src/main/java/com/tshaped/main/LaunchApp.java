package com.tshaped.main;

import com.tshaped.service.Password;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaunchApp {

    public static void main(String[] args) {

        //ApplicationContext
        //BeanFactory

        ApplicationContext container = new ClassPathXmlApplicationContext("applicationconfig.xml");
       Password pass = container.getBean( Password.class);
       pass.aboutAlgo();
    }
}
