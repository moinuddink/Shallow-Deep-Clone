package practice1;

public class Telusko {

    int id;
    String courseName;

    public Telusko(int id, String courseName) {
        this.id = id;
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "Telusko{" +
                "id=" + id +
                ", courseName='" + courseName + '\'' +
                '}';
    }
}
