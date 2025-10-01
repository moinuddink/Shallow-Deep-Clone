package Practice3;

public class Human {

    int age;

    public void display() {
        System.out.println("Humans are best creature");
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                '}';
    }
}
