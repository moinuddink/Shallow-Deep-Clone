package com.telusko.service;

import org.springframework.stereotype.Service;

@Service
public class JavaAdvancedCourse implements ISubject {


    public JavaAdvancedCourse() {
        System.out.println("Java bean created");
    }

    @Override
    public boolean getTheCourse(double amount) {
        System.out.println("SpringBoot Course is purchased and amount paid is"+amount);
        return true;
    }
}
