package service;

public class SpringBoot implements ICourse {


    public SpringBoot() {
        System.out.println("SpringBoot Bean Created");
    }

    @Override
    public Boolean buyTheCourse(Double price) {
        System.out.println("SpringBoot Course has been successfully purchased"+price);
        return true;
    }
}
