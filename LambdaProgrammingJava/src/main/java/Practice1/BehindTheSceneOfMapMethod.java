package Practice1;

import java.util.List;

public class BehindTheSceneOfMapMethod {

    public static void main(String[] args) {

        List<Integer> number = List.of(23,43,34,45,36,48);
        number.stream()
                .filter(n -> n%2==0)
                .map(n -> n*n)
                .forEach(e -> System.out.println(e));
    }
}
