package com.telusko.service;

public class TShapedSkills {

    private ICourse course;

    public TShapedSkills() {
    }

    public TShapedSkills(ICourse course) {
        System.out.println("Constructor Injection");
        this.course = course;
    }

    public void setCourse(ICourse course) { //ICourse course = new Java();
        System.out.println("Seeter Injection");
        this.course = course;
    }

    public Boolean buyTheCourse(Double amount)
    {
        Java a =new Java();
      //  a.getTheCourse(amount);
      //  return true;
//        return a.getTheCourse(amount);
        return course.getTheCourse(amount);
    }
}
