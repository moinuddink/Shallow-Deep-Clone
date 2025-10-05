package hyderabbastelusko4;

import java.util.Scanner;

public class Farmer {

    float pa;
    float td;
    float si;


   static float ri;
   static
   {
       ri=5.4f;
   }

   void input()
   {
       Scanner in = new Scanner(System.in);
       System.out.println("Enter the loan amount required");
        pa = in.nextInt();
       System.out.println("Enter the Time required in Years to repay");
       td =in.nextFloat();


   }

   void findSI()
   {
       si=(pa*td*ri)/100;
   }
   void dispSI()
   {
       System.out.println("The SI is"+si);
   }



}
