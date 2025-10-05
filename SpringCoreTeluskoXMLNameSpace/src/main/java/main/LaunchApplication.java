package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import util.Department;
import util.Employee;

public class LaunchApplication {

    public static void main(String[] args) {

        ApplicationContext container = new ClassPathXmlApplicationContext("applicationconfig.xml");
       Employee em =  container.getBean(Employee.class);
       System.out.println(em);

       Department dep =   container.getBean(Department.class);
       System.out.println(dep);
    }
}
