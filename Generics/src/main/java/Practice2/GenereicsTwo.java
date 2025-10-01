package Practice2;

public class GenereicsTwo {

    public static void main(String[] args) {

        Generics<Integer> gen = new Generics(55);
        gen.display();
        System.out.println(gen.getRef());

        Generics<String> gen2 = new Generics<>("Telusko");
        gen2.display();
        System.out.println(gen2.getRef());
    }
}
