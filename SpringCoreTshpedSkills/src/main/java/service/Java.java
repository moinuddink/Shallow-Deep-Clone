package service;

public class Java implements ICourse {

/*
* Constructors will excute when you create instance of an object
* */

    public Java() {
        System.out.println("Java Bean Created");
    }

    @Override
    public Boolean buyTheCourse(Double price) {
        System.out.println("Java Course has been successfully purchased"+price);
        return true;
    }
}
