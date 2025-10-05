package springcoreclass2;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaunchApp {

    public static void main(String[] args) {

        //Activate the spring framework
        //Application context container
        //BeanFactory
        //interview question what is the difference between Application context container and BeanFactory?


        ApplicationContext container = new ClassPathXmlApplicationContext("applicationconfig.xml");

      TeluskoMalumKarlo teluskoMalumKarlo =  container.getBean(TeluskoMalumKarlo.class);



       boolean status =  teluskoMalumKarlo.purchaseTheCourse(4545.1);
       if (status) {
           System.out.println("Successfully purchased the course");
       }else {
           System.out.println("Failed to purchase the course");
       }


    }
}
