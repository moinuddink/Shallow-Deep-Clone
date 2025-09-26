package FunctionalProgramming3;

import java.util.List;

public class DistinctwithSortProgram {


        public static void main(String[] args) {

            List<Integer> numbers = List.of(3,5,3,213,45,5,7);

            System.out.println(numbers);

            //Distinct elements code
            numbers.stream().distinct()
                    .sorted()
                    .forEach(element -> System.out.println(element));


        }
    }


