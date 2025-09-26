package FunctionalProgramming2;

import org.w3c.dom.ls.LSOutput;

import java.util.List;

public class FPNumberRunner {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(4,6,8,13,3,15);
        /*numbers.stream()
                .forEach(element -> System.out.println(element));*/

      int addition =  numbers.stream()
                .reduce(0, (number1, number2) -> number1+number2);//if two paremeters like number1 and number2 we need parenthesis

        int sumOfOddNumber = numbers.stream()
                        .filter(number -> number%2==1).reduce(0, (number1, number2) -> number1+number2);

        System.out.println(sumOfOddNumber);
        System.out.println(addition);
        int sum = normalSum(numbers);
    }

    private static int normalSum(List<Integer> numbers) {
        int sum = 0;
        for(int n: numbers) {
            sum += n;
        }
        return sum;
    }
}
