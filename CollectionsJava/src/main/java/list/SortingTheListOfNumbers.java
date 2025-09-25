package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingTheListOfNumbers {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(11, 2, 3, 4, 5, 26, 73, 8, 9, 10);
        System.out.println(numbers);

        List<Integer> numbers2 = new ArrayList<>(numbers);
        System.out.println(numbers2);

        Collections.sort(numbers2);
        System.out.println(numbers2);
    }
}
