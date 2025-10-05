package main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import util.Employee;


public class LaunchLazyInit {
    public static void main(String[] args) {

        //BeanFactory -->Lazy initializaiton
        //will my springboot will use BeanFactory -->No

        DefaultListableBeanFactory container  = new DefaultListableBeanFactory();
       XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(container);

       reader.loadBeanDefinitions("applicationconfig.xml");//other than resouce you have to give full path
        reader.loadBeanDefinitions("applicationconfig2.xml");
     Employee emp =   container.getBean("emp1", Employee.class);
     System.out.println(emp);

        reader.loadBeanDefinitions("applicationconfig.xml");//other than resouce you have to give full path
        Employee emp2 =   container.getBean("emp2", Employee.class);
        System.out.println(emp2);
    }
}
