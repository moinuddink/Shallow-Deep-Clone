package com.generics.part5;

import java.util.ArrayList;
import java.util.List;

public class CovarianceExample {

    public static void main(String[] args) {

        Employee[] employees = {new Employee(), new Employee()};
        printArray(employees);
        Developer[] developers = {new Developer(), new Developer()};
        printArray(developers);
        Manager[] managers = {new Manager(), new Manager()};
        printArray(managers);

        List<Employee> employeesList = List.of(new Employee(), new Employee());
        printArray1(employeesList);
        List<Developer> developersList = List.of(new Developer(), new Developer());
        //printArray1(developersList);

        String s = "Generics";
        Object o = s;//Covariance

        String[] sArray = {"Generics", "Collections"};
        Object obArray = sArray;//Covariance

        List<String> sList = new ArrayList<>();
        List<Object> oList = new ArrayList<>();
        //  oList = sList;//with collections not going to work for Covariance
        //why collection  dosen't support covraince

        Number[] numArray = {1, 2, 3};
        Object[] objectArray = numArray;//Covriance Accepted
     /*   Exception in thread "main" java.lang.ArrayStoreException: java.lang.String
        at com.generics.part5.CovarianceExample.main(CovarianceExample.java:30)*/

        objectArray[0] = "Generics";


    }

    public static void printArray(Employee[] employees) {
        for (Employee e : employees) {
            System.out.println(e);
        }

    }

    public static void printArray1(List<Employee> employees) {
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
