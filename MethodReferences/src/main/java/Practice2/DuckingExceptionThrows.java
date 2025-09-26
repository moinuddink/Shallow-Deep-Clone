package Practice2;

public class DuckingExceptionThrows {
    public static void main(String[] args) {
        System.out.println("Application started - Main Application");

        Demo demo = new Demo();
        demo.division();
       // demo.disp();
        System.out.println("Application smoothly terminated");
    }
}
