package service;

public class TShapedSkills {

    private ICourse course;

    public TShapedSkills() {
        System.out.println("TShapedSkills Bean Created");
    }

    public void setCourse(ICourse course) { //ICourse course = new Java();
        //ICourse course = new SpringBoot();
        //Setter Injection
        System.out.println("Setter Injection");
        this.course = course;
    }

    public TShapedSkills(ICourse course) {
        super();
        System.out.println("Dependency Injection Constructor Injection");
        this.course = course;
    }

    public Boolean buyTheCourse(Double price) {

        return course.buyTheCourse(price);
    }
}
