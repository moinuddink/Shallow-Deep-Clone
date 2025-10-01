package Practice3;

public class Cricketer {

    int age;
    String name;
    double average;

    public Cricketer(int age, String name, double average) {
        this.age = age;
        this.name = name;
        this.average = average;
    }

    @Override
    public String toString() {
        return "Cricketer{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", average=" + average +
                '}';
    }
}
