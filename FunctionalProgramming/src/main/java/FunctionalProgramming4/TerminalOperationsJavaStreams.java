package FunctionalProgramming4;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TerminalOperationsJavaStreams {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(23,12,34,213,45,4,7);
      //  List<Integer> numbers = List.of(23,12,34,213,45,4,7).stream().max((n1,n2)->Integer.compare(n1,n2)).get();//max number
        //  List<Integer> numbers = List.of(23,12,34,213,45,4,7).stream().min((n1,n2)->Integer.compare(n1,n2)).get();//min number
        //  List<Integer> numbers = List.of(23,12,34,213,45,4,7).stream().filter(element -> element%2==1).forEach(element -> System.out.println(element));

        //List<Integer> numbers = List.of(23,12,34,213,45,4,7).stream().filter(element -> element%2==1).collect(Collectors.toList(element));//odd numbers<--boxed convert the streams in to integer-->
        //List<Integer> numbers = List.of(23,12,34,213,45,4,7).stream().filter(element -> element%2==0).collect(Collectors.toList(element));//odd numbers
        IntStream.range(1,11)
                .map(element -> element*element)
                .boxed().collect(Collectors.toList());//List of first 9 squares

        //


//        IntStream.range(0,11).reduce(0, (x, y) -> x+y);
    }
}
