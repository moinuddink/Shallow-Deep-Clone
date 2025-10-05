package CopyConstructorJava;

public class MainMethodExample {
    public static void main(String[] args) {

        A obj = new A();
//        System.out.println(obj);
        A obj2 = new A(obj);
    }
}
