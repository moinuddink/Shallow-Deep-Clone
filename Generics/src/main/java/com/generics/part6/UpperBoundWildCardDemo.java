package com.generics.part6;

import java.util.ArrayList;
import java.util.List;

public class UpperBoundWildCardDemo {
    public static void main(String[] args) {

        List<Employee> employees = List.of(new Employee(), new Employee(), new Employee());

        printEmployeeNames(employees);
        List<Developer> developers = List.of(new Developer(), new Developer(), new Developer());

        printEmployeeNames(developers);
        List<Manager> managers = List.of(new Manager(), new Manager(), new Manager());

        printEmployeeNames(managers);

    }

    public static void printEmployeeNames(List<? extends Employee> employess){
//        employess.add(new Employee())--> when using ? upperbound wild card we can't add new element or object inside the collection
        for(Employee employee : employess){
            System.out.println(employee);
        }

    }
}
