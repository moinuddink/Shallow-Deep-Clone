package Practice1;

import java.util.List;
import java.util.function.Predicate;

public class MethodReferencePredicate {
    public static void main(String[] args) {
        //1.Storing Functions in variables
        //2.Passing functions to methods <=
        //3.Returning functions from methods

        Predicate<? super Integer> evenPredicate = n -> n%2 ==0;
        Predicate<? super Integer> oddPredicate = n -> n % 2 == 1;

        List<Integer> numbers = List.of(23,45,67,34);

        numbers.stream()
                .filter(evenPredicate)
                .map(n -> n*n)
                .forEach(MethodReferencesRunner::print);

        numbers.stream()
                .filter(oddPredicate)
                .map(n -> n*n)
                .forEach(MethodReferencesRunner::print);
    }
}
