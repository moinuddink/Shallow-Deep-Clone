package Practice2;

import java.util.Scanner;

public class DuckingException {

    public void division() throws ArithmeticException{

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numerator for division");
        int number1 = scanner.nextInt();

        System.out.println("Enter the denominator for division");
        int number2 = scanner.nextInt();

        int result = number1 / number2;

        System.out.println("The Result is" + result);

        System.out.println("Demo End");
    }
}
