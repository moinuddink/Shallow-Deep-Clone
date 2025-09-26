package Practice1;

import java.util.List;
import java.util.function.Consumer;

public class SystemOutConsumer implements Consumer<Integer> {
    @Override
    public void accept(Integer number) {
        System.out.println(number);
    }

    public static void main(String[] args) {

        List<Integer> number = List.of(23,43,34,45,36,48);
        number.stream()
                .filter(new EvenNUmberPredicate())
                .forEach(new SystemOutConsumer());

        //<R> Stream<R> map(Function<? super T, ? extends R> mapper);
        //R apply(T t);
    }
}
