package FunctionalProgramming3;

import java.util.List;

public class MapOpertaionStreamFP {

    public static void main(String[] args) {

        //Operation on squares of the numbers
        List<Integer> numbers = List.of(3,5,8,213,45,4,7);
        numbers.stream().distinct()
                .map(element -> element*element).forEach(element -> System.out.println(element));
    }
}
