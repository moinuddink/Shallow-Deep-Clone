package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.TShapedSkills;

public class LaunchtheApplication {

    public static void main(String[] args) {

        //Inversion of Control
        //Entire of control of object creation and object management/dependency injection  i will hand over to spring framework
        //IOC-->activate the container(IOC Container)
        //if the object is created by Ioc container or springframework then we call it as bean
        //Appication Context and BeanFactory
        //Application Context -->Eager Initialization
        //BeanFactory is lazy initialization
        //Setter Injection use property tag
        //Constructor injection using the <constructor-arg></constructor-arg>
        //if you don't specity during autowire spring will use setter injection
        //Through Constructor we can go like this --><bean id="ts" class="service.TShapedSkills" autowire="constructor">
        //in ApplicationContext we are loading the file through the constructor if you want one more constructor file to be loaded then you have to create another object  which means one more IOC container you have to create
        //if you want to load four configuration file then you have to create four IOC container you have to create
        //using ApplicationContext one per one IOC container
        //per IOC Container one configuration xml file
        ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");//activate the springframework
         TShapedSkills    t = container.getBean(TShapedSkills.class);
        Boolean  status = t.buyTheCourse(4564.210);
        if (status) {
            System.out.println("Your course has been built.");
        }else {
            System.out.println("Your course has not been built.");
        }
    }
}
