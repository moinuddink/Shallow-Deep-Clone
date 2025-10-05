package PracticeMain;

import Service.DevOpsCourse;
import Service.JavaCourse;
import Service.Telusko;

public class LuanchApp {
    public static void main(String[] args) {

        Telusko telusko = new Telusko();//target object/class
        //Injecting dependent object into target class/object --> dependency
      /*  JavaCourse java  = new JavaCourse();
        telusko.setCourse(java);*/
        telusko.setCourse(new JavaCourse());//setter injection
        telusko.buyTheCourse(10);
        telusko.setCourse(new DevOpsCourse());//setter injection
     boolean status = telusko.buyTheCourse(100.00);
     if(status)
         System.out.println("You have successfully built the course");
     else
         System.out.println("You have not successfully built the course");

    }





}
