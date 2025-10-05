package com.telusko.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class DevloperCourse implements ISubject {

    public DevloperCourse() {
        System.out.println("Devloper bean created");
    }

    @Override
    public boolean getTheCourse(double amount) {
        return false;
    }
}
