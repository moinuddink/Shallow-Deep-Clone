package com.boxing1;

public class BoxingDemoOne {



    public static void main(String[] args) {

        int age = 19;

        //Approach below is depricated

        Integer integer = Integer.valueOf(age);
        Double doubleValue = Double.valueOf(3.14);
        Long longValue = Long.valueOf("4546464");

        int num1 = Integer.valueOf(age);
        Double doubleValue2 = Double.valueOf(3.14);
        Long longValue2 = Long.valueOf("4546464");

        System.out.println(num1);
        System.out.println(doubleValue);
        System.out.println(longValue);
    }
}
