package Practice1;

import java.util.Arrays;
import java.util.List;

public class Practice1 {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("John", "Jane", "Jack", "Bob", "Jill");
       List<String> uNames= names.stream()
                .map(String::toUpperCase)
                .toList();
       uNames.forEach(System.out::println);
    }
}
