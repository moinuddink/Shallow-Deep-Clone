package com.clone;

public class Teacher implements Cloneable {

    int age;
    char gender;

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "age=" + age +
                ", gender=" + gender +
                '}';
    }
}
