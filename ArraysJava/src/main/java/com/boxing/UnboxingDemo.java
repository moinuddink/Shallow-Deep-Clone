package com.boxing;

public class UnboxingDemo {

    public static void main(String[] args) {

        int num=16;

        //Boxing
        Integer integer1 = Integer.valueOf(num);
        Double double1 = Double.valueOf("3.14");
        Long long1 = Long.valueOf("546494");

        //unboxing
        int num1 = integer1.intValue();
         double num2= double1.doubleValue();
         long num3= long1.longValue();

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
    }
}
