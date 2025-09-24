package com.immutable;

public final class Person {

    private final String name;
    private final String occupation;

    public Person(String name, String occupation) {
        this.name = name;
        this.occupation = occupation;
    }
    public String getName() {
        return name;
    }
    public String getOccupation() {
        return occupation;
    }
}
