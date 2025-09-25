package com.generics.part3;

public class GenericMethodDemo {

    public static void main(String[] args) {
        String[] stringArray = {"Hello", "World"};
        printArray(stringArray);
        Integer[] integerArray = {1, 2, 3};
        printArray(integerArray);

    }

    public static<T>void printArray(T[] array) {
        for (T s : array) {
            System.out.println(s);
        }
    }
}
