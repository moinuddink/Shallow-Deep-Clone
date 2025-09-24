package com.boxing;

public class BoxingDemo {

    public static void main(String[] args) {

        int age = 18;

        //Approach 1 - with the help of Constructor
        Integer integer = new Integer(age);
        Double doubleObj= new Double(3.14);
        Long longObj = new Long("5656565");

        //Approach 2 - with the help of valueOf()

        Integer integer1 = Integer.valueOf(age);
        Double doubleObj1 = Double.valueOf("3.14");
        Long longObj1 = Long.valueOf("5656565");

        int num1 = Integer.valueOf(age);
        int num2 = Integer.valueOf("18");
        System.out.println(num1);
        System.out.println(num2);
    }
}
