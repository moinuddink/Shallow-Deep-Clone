package FunctionalProgramming1;

import java.util.List;

public class FunctionalProgrammingRunner {

    public static void main(String[] args) {

        List<String> list = List.of("Apple", "Banana", "Orange", "Water", "Pear","Bat","Cat");

        printWithFPWithFiltering(list);
    }

    private static void printBasic(List<String> list) {
        for(String s : list) {
            System.out.println(s);
        }
    }

    private static void printWithFP(List<String> list) {
       list.stream().forEach(element -> System.out.println("element - "+element));
    }

    private static void printWithFPWithFiltering(List<String> list) {
        list.stream()
                .filter(element -> element.endsWith("at"))
                .forEach(element -> System.out.println("element - "+element));
    }

    private static void printBasicWithFiltering(List<String> list) {
        for(String s : list) {
            if (s.endsWith("at")) {
                System.out.println(s);
            }
        }
    }

}
