package hyderabbastelusko1;

public class LuanchStatic1 {

    static int num1;

    static
    {
        num1=4;
        System.out.println("Static Block");
    }

    public static void main(String[] args) {

        System.out.println("Main Method");
    }
}
