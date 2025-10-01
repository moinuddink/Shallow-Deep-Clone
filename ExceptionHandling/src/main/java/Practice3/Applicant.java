package Practice3;

import java.util.Scanner;

public class Applicant {

    int age;

    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        age = sc.nextInt();
    }

    public void verify() throws UnderAgeException, OverAgeException {
        if(age < 18 ){
            UnderAgeException un = new UnderAgeException("Under age Ineligible to apply for the driver licence");
            System.out.println(un.getMessage());
            throw un;
        } else if(age >60){
            OverAgeException ov = new OverAgeException("Over age Ineligible to apply for the driver licence");
            System.out.println(ov.getMessage());
            throw ov;
        } else {
            System.out.println("Eligible for Applicant licence");
        }
    }
}
