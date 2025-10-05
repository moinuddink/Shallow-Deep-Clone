package com.telusko.service;

import org.springframework.stereotype.Service;

@Service
public class SpringCore implements ISubject{


    public SpringCore() {
        System.out.println("Spring bean created");
    }

    @Override
    public boolean getTheCourse(double amount) {
        System.out.println("Spring Course is purchased and amount paid is"+amount);
        return true;
    }
}
