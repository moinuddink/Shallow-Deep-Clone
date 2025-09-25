package com.generics.part1;

public class NonGenericCodeDemo {

    public static void main(String[] args) {

        Pair stringIntPair = new Pair("Hello", 42);
        stringIntPair.setFirst(16);
      String str= (String) stringIntPair.getFirst();//Requires Casting
       int myInt=(Integer) stringIntPair.getSecond();//Requires Casting

        System.out.println(str);
        System.out.println(myInt);


        //with Object we will get the below error

       /* Exception in thread "main" java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.String (java.lang.Integer and java.lang.String are in module java.base of loader 'bootstrap')
        at com.generics.part1.NonGenericCodeDemo.main(NonGenericCodeDemo.java:9)*/
    }
}
