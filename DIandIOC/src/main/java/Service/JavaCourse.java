package Service;

public class JavaCourse implements ICourse {
    @Override
    public boolean getTheCourse(double amount) {
        System.out.println("Java course is purchased and amount paid is " + amount);
        return false;
    }
}
