package hyderabbastelusko2;

public class Alpha {

    static int num1; //static variable

    int num2;//instance variable
/*
* when does instance varaibles get memory allocation?
* during object creation*/
    //Static block
    static
    {
        num1 = 4;
        System.out.println("Static Block");
    }

    //Constructor
    public Alpha() {
        num2 = 5;
        System.out.println("Alpha Constructor");
    }
//non static block
    {
        System.out.println("Java Block --> Non Static block");
    }

    void displa() {
        System.out.println("non static method");
        System.out.println(num1);
        System.out.println(num2);
    }

   static void display() {
        System.out.println(" static method");
        System.out.println(num1);

    }
}
