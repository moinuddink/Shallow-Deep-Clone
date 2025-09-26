package Practice3;

import java.util.Scanner;


/*
*throw-:
* 1)inside body of method
* 2)manually thow an exception(re-throwing)
*
* throws-:
* 1)method signature
* 2)Ducking an exception
*
* */
public class Demo1 {

    public void division(){
        System.out.println("Demo start");
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Enter the first number for Numerator");
            int num1 = scanner.nextInt();

            System.out.println("Enter the second number for Denominator");
            int num2 = scanner.nextInt();

            int result = num1 / num2;
            System.out.println("The Result is :"+result);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception Occured");
            throw new ArithmeticException();
            //whatever statements are there below the throw/return keyword they will not be executed
            //After Exception is generated two things happen
            //1.Handle
            //2.Ignore
            //finally will be executed after the return and

        }finally {
            System.out.println("Demo concluded-finally");
        }
        System.out.println("Demo end");
    }

    public int disp(){
        try{
            return 4;
        }
         finally
        {
            System.out.println("After return");
        }
    }
}
