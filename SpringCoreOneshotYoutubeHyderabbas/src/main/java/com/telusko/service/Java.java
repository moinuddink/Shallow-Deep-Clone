package com.telusko.service;

public class Java implements ICourse{
    @Override
    public Boolean getTheCourse(Double amount) {
        System.out.println("Java Course is Purchased Successfully and fee paid is " + amount);
        return true;
    }
}
