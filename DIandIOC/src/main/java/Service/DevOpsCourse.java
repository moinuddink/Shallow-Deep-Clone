package Service;

public class DevOpsCourse implements ICourse {

    @Override
    public boolean getTheCourse(double amount) {
        System.out.println("DevOps course is purchased and amount paid is " + amount);
        return false;
    }
}
