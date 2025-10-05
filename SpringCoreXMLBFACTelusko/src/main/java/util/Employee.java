package util;

public class Employee {
    Integer id;

    String name;

    Double salary;

    String city;


    //if there is a parametirzed constructor then there will not be default constructor
    public Employee(Integer id, String name, Double salary, String city) {
        super();
        System.out.println("Employee bean created");
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.city = city;
    }

    public Employee(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", city='" + city + '\'' +
                '}';
    }
}
