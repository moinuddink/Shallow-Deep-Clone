package com.telusko.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TeluskoMalumKarlo {

  /*  @Autowired
    @Qualifier("springCore")*/
    private ISubject subject;

    @Autowired
    // @Qualifier("springCore") -->at constructor level it is not applicable
  //  public TeluskoMalumKarlo(@Qualifier("javaAdvancedCourse") ISubject subject) {//ISubject subject = new DevloperCourse(); --@Qualifier is applicable at paremeter lever
    public TeluskoMalumKarlo( ISubject subject) {
        super();
        System.out.println("Constructor Injection");
        this.subject = subject;
    }


    public TeluskoMalumKarlo() {
        super();
        System.out.println("TeluskoMalumKarlo bean created");
    }

    @Autowired
    @Qualifier("springCore")
    public void setSubject(ISubject subject) {//Setter injection--> ISubject subject = new JavaAdvancedCourse();
        System.out.println("Setter Injection");
        this.subject = subject;
    }

    public boolean purchaseTheCourse(double amount) {
        return subject.getTheCourse(amount);
    }
}
