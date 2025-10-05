package springcoreclass2;

public class SpringCore implements ISubject{


    public SpringCore() {
        System.out.println("Spring bean created");
    }

    @Override
    public boolean getTheCourse(double amount) {
        return false;
    }
}
