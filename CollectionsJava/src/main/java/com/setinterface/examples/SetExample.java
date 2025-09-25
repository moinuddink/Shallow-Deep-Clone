package com.setinterface.examples;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {

        //Set doesn't allow duplicates
        //Set doesn't care about the order so we can't add based on position
        //Set are used to store unique values
        Set<String> set = Set.of("A", "B", "C");
        System.out.println(set);
        //set.add("A"); -->Not allowed

        System.out.println("*******************************");

        Set<String> hashSet = new HashSet<>(set);
        System.out.println(hashSet);
        hashSet.add("A");
        System.out.println(hashSet);

    }
}
