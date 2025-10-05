package com.telusko.service;

public class SpringBoot implements ICourse {
    @Override
    public Boolean getTheCourse(Double amount) {
        System.out.println("SpringBoot is Purchased Successfully and fee paid is " + amount);
        return true;
    }
}
