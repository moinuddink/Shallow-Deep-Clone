package Practice1;

import java.util.List;

public class MethodReferencesRunner {

    public static void main(String[] args) {


        List<String> methodReferencesValues = List.of("Ant","Bat","Cat","Dog","Elephant","Fox","Girl");

        methodReferencesValues.stream()
                .map(s ->s.length())
                .forEach(e -> System.out.println(e));

        System.out.println("***********************************: MethodReference below sample");
        methodReferencesValues.stream()
                .map(s ->s.length())
                .forEach(MethodReferencesRunner::print);

        System.out.println("***********************************: MethodReference String added sample String is here a instance method");
        methodReferencesValues.stream()
                .map(String::length)
                .forEach(MethodReferencesRunner::print);

        //Max for the even number
        List<Integer> numbers = List.of(23,45,67,34);
      Integer max=  numbers.stream()
                .filter(MethodReferencesRunner::isEven)
                .max(Integer::compare)
                .orElse(0);
      System.out.println(max);
    }

    public static void print(Integer integer) {
        System.out.println(integer);
    }

    public static boolean isEven(Integer i){
        return i%2==0;
    }
}
