package Service;

public class Telusko {

    private ICourse course;

    public void setCourse(ICourse course) { //ICourse course = new JavaCourse();
        this.course = course;
    }

    public boolean buyTheCourse(double amount)
    {
        /*JavaCourse java  = new JavaCourse();
       boolean status = java.getTheCourse(amount);
        return status;*/
        /*JavaCourse java  = new JavaCourse();

        return java.getTheCourse(amount);*/

        return course.getTheCourse(amount);

    }
}
