package Practice1;

import java.util.List;
import java.util.function.Predicate;

public class EvenNUmberPredicate implements Predicate<Integer> {
    @Override
    public boolean test(Integer number) {
        return number%2 == 0;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(3, 5, 8, 213, 45, 4, 7);
        numbers.stream()
                .filter(new EvenNUmberPredicate())
                .forEach(number -> System.out.println(number));
    }
}
