package Practice1;

import java.util.List;

public class ProgramOne {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(3, 5, 8, 213, 45, 4, 7);

//        numbers.stream().filter(number -> number % 2 == 0).max((n1, n2) -> Integer.compare(n1, n2)).get();
        numbers.stream().filter(number -> number % 2 == 0).max((n1, n2) -> Integer.compare(n1, n2)).isPresent();
    }
}
