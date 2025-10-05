package CopyConstructorJava;

public class A {
    int age;
    String name;

    public A() {
        age = 18;
        name = "John";
        System.out.println(age+" "+name);
    }

    public A(A ref) {
        age = ref.age;
        name = ref.name;
        System.out.println(age+" "+name);
    }

    @Override
    public String toString() {
        return "A{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
