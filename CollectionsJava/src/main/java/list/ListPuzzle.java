package list;

import java.util.ArrayList;
import java.util.List;

public class ListPuzzle {

    public static void main(String[] args) {

        List puzzle = List.of("A", 'A',1,1.0);
        System.out.println(puzzle);


        boolean b1 = puzzle.get(0) instanceof String;
        System.out.println(b1);
        boolean b2 = puzzle.get(1) instanceof Character;
        System.out.println(b2);
        boolean b3 = puzzle.get(2) instanceof Integer;
        System.out.println(b3);
        boolean b = puzzle.get(3) instanceof Double;
        System.out.println(b);
        System.out.println(puzzle.get(0));

        List<String> textValues = List.of("a", "b", "c");//here we can store only string values apart from this we cannot store other values
        List<Integer> numbers = List.of(101, 201, 301, 401, 501);
        numbers.indexOf(1);
        System.out.println(numbers.indexOf(101));
        System.out.println(numbers.indexOf(201));
        System.out.println(numbers.indexOf(301));
        System.out.println(numbers.indexOf(401));
        System.out.println(numbers.indexOf(501));

        //Remove
        List<Integer> numbers1 = new ArrayList<>(numbers);
        System.out.println(numbers1.remove(Integer.valueOf(101)));
        System.out.println(numbers1);

    }
}
