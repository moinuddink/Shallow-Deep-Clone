package com.singletonpattern1;

public class A {

  public  static A obj;//1step


    private A() { //2nd step
        System.out.println("Instance Created");
    }


    public static  A getInstance() { //Double checked Locking

        if(obj == null) {
            synchronized (A.class) {
                if(obj == null) {
                    obj = new A();
                }
            }
        }
        return obj;
    }


}
