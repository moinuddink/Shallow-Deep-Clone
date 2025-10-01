package Practice1;

import java.util.Scanner;

public class ATM {

    int accNo=1;
    int passWord =2;

    int acc;
    int pw;

    public void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter User Name");
        acc=sc.nextInt();
        System.out.println("Enter Password");
        pw=sc.nextInt();

    }

    public void verify() throws InvalidCustomerException {
        if(accNo==acc&& passWord ==pw){
            System.out.println("You have successfully verified your account");
        } else {
           InvalidCustomerException ice = new InvalidCustomerException("Invalid Customer Details");
           // System.out.println("You have unsuccessfully verified your account");
            System.out.println(ice.getMessage());
           throw ice; //1.first way
           // throw new InvalidCustomerException();//2.2nd way both 1 & 2 are same
        }
    }
}
