package com.generics.part2;

public class GenericCodeDemo<S, I extends Number> {

    public static void main(String[] args) {

        GenericPair<String, Integer> demo = new GenericPair<>("Hello", 42);
        //with the help of we can write generic code
        //compiler so that no class cast exception don't get at runtime
        //if need we can change the content which means it is mutable
        demo.setFirst("World");
        demo.setSecond(218);
        String s = demo.getFirst();
        System.out.println(s);
        Integer i = demo.getSecond();
        System.out.println(i);


    }
}
