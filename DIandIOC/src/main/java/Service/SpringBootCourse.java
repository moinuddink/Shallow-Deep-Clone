package Service;

public class SpringBootCourse implements ICourse {

    @Override
    public boolean getTheCourse(double amount) {
        System.out.println("SpringBootCourse course is purchased and amount paid is " + amount);
        return false;
    }
}
