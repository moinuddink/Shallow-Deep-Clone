package FunctionalProgramming3;

import java.util.List;

public class FPRunnerProgram {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(3,5,8,213,45,4,7);

        //Sorting in a Stream take all the numbers and sort
        numbers.stream()
                .sorted()
                .forEach(number -> System.out.println(number));


    }
}
