package CloneObjectsJavaExample;

public class MainExampleOfClone {

    public static void main(String[] args) throws CloneNotSupportedException {
        Employee employee1 = new Employee();
        employee1.age= 45;
        employee1.salary= 1_00_00.00;

        Employee employee2 = (Employee) employee1.clone();

        System.out.println(employee1);
        System.out.println(employee2);
    }
}
