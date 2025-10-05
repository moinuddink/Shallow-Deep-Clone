package springcoreclass2;

public class JavaAdvancedCourse implements ISubject {


    public JavaAdvancedCourse() {
        System.out.println("Java bean created");
    }

    @Override
    public boolean getTheCourse(double amount) {
        return false;
    }
}
