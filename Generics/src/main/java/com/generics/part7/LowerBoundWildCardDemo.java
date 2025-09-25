package com.generics.part7;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundWildCardDemo {

    public static void main(String[] args) {

        addNumbers(new ArrayList<>());
    }

    public static void addNumbers(List<? super Integer> list){

        for(int i = 1; i <= 10; i++){
            list.add(i);
        }
        System.out.println(list);

    }
}
