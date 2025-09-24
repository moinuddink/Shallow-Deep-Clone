package com.shallow;

public class ShallowJavaExample {
    public static void main(String[] args) {

        Developer developer = new Developer();
        developer.age= 45;
        developer.salary= 1_00_00f;

        System.out.println(developer);

        Developer developer1 = new Developer();
        developer1.age= 45;
        developer1.salary= 1_22_20f;
        System.out.println(developer1);
    }
}
