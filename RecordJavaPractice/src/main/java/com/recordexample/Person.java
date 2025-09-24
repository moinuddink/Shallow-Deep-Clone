package com.recordexample;

public record Person(String name, int age) {

    //Canonical Constructor
  /*  public Person(String name, int age) {
        if(name == null || age == 0){
            throw new IllegalArgumentException("Name and age cannot be null");
        }
        this.name = name;
        this.age = age;
    }*/

    //Compact Constructor
    public Person {
        if(name == null || age == 0) {
            throw new IllegalArgumentException("Name and age are required");
        }
    }
}
