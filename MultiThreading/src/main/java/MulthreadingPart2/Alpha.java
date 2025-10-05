package MulthreadingPart2;

import java.util.Scanner;

public class Alpha {

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

    public void focus() throws InterruptedException {
        System.out.println("Printing important message activity");
        for(int i=0;i<4;i++){
            System.out.println("Focus is the key......");
            Thread.sleep(4000);
        }
        System.out.println("Printing important message activity completed");
    }
    public void printingStars() throws InterruptedException {
        System.out.println("Printing stars activity started");
        for(int i=0;i<4;i++){
            System.out.println(" * *");
            Thread.sleep(4000);
        }
        System.out.println("Printing stars activity completed");
    }
}
