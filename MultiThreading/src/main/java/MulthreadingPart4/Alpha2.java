package MulthreadingPart4;

import java.util.Scanner;

public class Alpha2 implements Runnable {

    @Override
    public void run() {
        addition();
    }
    public void addition()
    {
        System.out.println("Addition activity started");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first Number for addition");
        int num1 = scanner.nextInt();
        System.out.println("Enter second Number for addition");
        int num2 = scanner.nextInt();
        int res = num1 + num2;
        System.out.println("Result is " + res);
        System.out.println("Addition activity finished");
    }
}
