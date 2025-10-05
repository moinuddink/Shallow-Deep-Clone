package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import util.Employee;

public class LuanchApp {

    public static void main(String[] args) {

        ApplicationContext container = new ClassPathXmlApplicationContext("applicationconfig.xml");
        //Per IOC container one configuration file
       /*Employee em = container.getBean(Employee.class);
        System.out.println(em);*/
      /* Employee emp1 = container.getBean("emp1", Employee.class);
        System.out.println(emp1);
        Employee emp2 = container.getBean("emp2", Employee.class);
        System.out.println(emp2);
        Employee emp3 = container.getBean("emp3", Employee.class);
        System.out.println(emp3);*/


    }
}
