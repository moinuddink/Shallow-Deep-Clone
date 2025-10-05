package main;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import service.TShapedSkills;

public class LaunchtheApplication2 {

    public static void main(String[] args) {

//here in constructor you won't be able to specify the xml configuration(For BeanFactory)
        //Lazy intialization
//in bean we are using the method for configuration file
//By using the one IOC container you can load multiple xml files
        //per IOC container mulitple configuration files
        DefaultListableBeanFactory container = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(container);
//        reader.loadBeanDefinitions(new ClassPathResource("applicationContext.xml"));
        reader.loadBeanDefinitions("applicationContext.xml");
        reader.loadBeanDefinitions("applicationContext2.xml");
         TShapedSkills    t = container.getBean(TShapedSkills.class);
        Boolean  status = t.buyTheCourse(4564.210);
        if (status) {
            System.out.println("Your course has been built.");
        }else {
            System.out.println("Your course has not been built.");
        }
    }
}
