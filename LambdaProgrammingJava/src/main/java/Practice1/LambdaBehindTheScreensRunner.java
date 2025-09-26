package Practice1;

import java.util.List;
import java.util.stream.Stream;

public class LambdaBehindTheScreensRunner {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(23, 5, 8, 213, 45, 4, 7);

        numbers.stream()
                .filter(number -> number % 2 == 0)
                .forEach(number -> System.out.println(number));

        //Stream<T> filter(Predicate<? super T> predicate);
        //boolean test(T t)
        //void forEach(Consumer<? super T> action);
        //void accept(T t);

    }
}
