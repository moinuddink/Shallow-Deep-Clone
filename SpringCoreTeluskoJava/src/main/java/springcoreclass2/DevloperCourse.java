package springcoreclass2;

public class DevloperCourse implements ISubject {

    public DevloperCourse() {
        System.out.println("Devloper bean created");
    }

    @Override
    public boolean getTheCourse(double amount) {
        return false;
    }
}
