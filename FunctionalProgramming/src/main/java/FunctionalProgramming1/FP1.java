package FunctionalProgramming1;

import java.util.List;

public class FP1 {


    public static void main(String[] args) {

        List<Integer> list = List.of(1,4,5,6,7);

        list.stream()
                .filter(element -> element%2 ==1)
                .forEach(element -> System.out.println("element - "+element));

        System.out.println("****************************************");


        list.stream()
                .filter(element -> element%2 ==0)
                .forEach(element -> System.out.println("element - "+element));
    }


}
