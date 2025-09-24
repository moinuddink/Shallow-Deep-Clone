package CloneObjectsJavaExample;

public class Employee implements Cloneable {

    int age;
    double salary;

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", salary=" + salary +
                '}';
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
