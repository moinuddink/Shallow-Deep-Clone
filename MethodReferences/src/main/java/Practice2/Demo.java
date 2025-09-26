package Practice2;

import java.util.Scanner;

public class Demo {

    public void division(){

        System.out.println("Demo Start");
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter the numerator for division");
            int number1 = scanner.nextInt();

            System.out.println("Enter the denominator for division");
            int number2 = scanner.nextInt();

            int result = number1 / number2;

            System.out.println("The Result is" + result);

        }catch (Exception e){
            System.out.println("Exception occured in demo");
        }
        System.out.println("Demo End");
    }
    public void disp(){
        division();
    }
}
