package FunctionalProgramming3;

import java.util.List;
import java.util.stream.IntStream;

public class PrintSquaresOfFirstTenIntegerNumbers {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(4,6,8,13,3,15);

        //Exercise - Print squares of first 10 numbers
        //IntStream.range(1,10)

        IntStream.range(0,11).forEach(number -> System.out.println(number));
        IntStream.range(0,11).map(element -> element*element).forEach(element -> System.out.println(element));


        //List.of("Apple", "Ant", "Bat").stream()
        //Map all of these to lowercase and print them

        List<String> text = List.of("Apple","Banana");
        text.stream()
                .map(element -> element.toLowerCase())
                .forEach(element -> System.out.println(element));
        //List.of("Apple", "Ant", "Bat").stream()
        //Print the length of each element


        List<String> textValue = List.of("Apple","Ant","Bat");
        textValue.stream().map(element -> element.length()).forEach(element -> System.out.println(element));

    }
}
