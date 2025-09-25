import java.util.Scanner;

public class LuanchEh1 {

    public static void main(String[] args) {

        System.out.println("Application Started");
        //try block doesn't handle the exception
        //catch block will handle the exception
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the numerator for division");
            int num1 = sc.nextInt();

            System.out.println("Enter the denominator for division");
            int num2 = sc.nextInt();

            int result = num1 / num2;

            System.out.println("The result is " + result);


        } catch (ArithmeticException e) {
            System.out.println("Enter the non-zero denominator");
        }
        System.out.println("Maths App ended smoothly");
    }

    //interview question  --> what is exception and how we manage and handle the exception in java
    //handling the exception is try catach and finally
    //managing the exception is by throw and throws

}
