import java.util.Scanner;

public class LuanchEh2 {

    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number for division");
            int num1 = scanner.nextInt();

            System.out.println("Enter the number for denominator");
            int num2 = scanner.nextInt();

            int result = num1 / num2;

            System.out.println("The result is " + result);

            System.out.println("Enter the size of an array");
            int size = scanner.nextInt();
            int ar[] = new int[size];
            System.out.println("Enter the element to be added in array");
            int data = scanner.nextInt();
            System.out.println("Enter the indesx/position at which element to be added in array");
            int index = scanner.nextInt();
            ar[index] = data;
            System.out.println("Data added successfully");

        } catch (ArithmeticException e) {
            System.out.println(
                    "Invalid input! Please try again"
            );
        } catch(NegativeArraySizeException e) {
            System.out.println("Please enter non negative int value");
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Please be in your limits");
        } catch(Exception e) {//this should be declared at the last
            System.out.println("Something went wrong");
        }
        System.out.println("App terminated smoothly");

    }
}
