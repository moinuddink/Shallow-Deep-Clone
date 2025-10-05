package com.telusko.main;

import com.telusko.service.Java;
import com.telusko.service.SpringBoot;
import com.telusko.service.TShapedSkills;

public class LaunchApp {
    public static void main(String[] args) {

        //Target Object and Dependent object
        //Target Class here is TShapedSkills
        TShapedSkills ts = new TShapedSkills(new SpringBoot());//Constructor Injection
        ts.setCourse(new Java());//setter injection
        ts.setCourse(new SpringBoot());
       Boolean status = ts.buyTheCourse(48484.45);

       if (status) {
           System.out.println("You have successfully built the course");
       } else {
           System.out.println("You have failed to built the course");
       }
    }
}
