package Practice1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class NumberSquareMapper implements Function<Integer, Integer> {

    @Override
    public Integer apply(Integer number) {
        return number * number;
    }

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        numbers.stream()
                .filter(new EvenNUmberPredicate())
                .map(new NumberSquareMapper())
                .forEach(new SystemOutConsumer());
    }
}
