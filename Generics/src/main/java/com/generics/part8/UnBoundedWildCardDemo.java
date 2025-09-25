package com.generics.part8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnBoundedWildCardDemo {

    public static void main(String[] args) {

        List<Integer> li = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<String> ls = Arrays.asList("One", "Two", "Three", "Four", "Five");
        printList(li);
        printList(ls);



    }

    public static void printList(List<?> list){
        for(Object obj : list){
            System.out.println(obj);
        }
        System.out.println(list.size());
    }
}
