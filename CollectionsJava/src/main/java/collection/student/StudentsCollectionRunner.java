package collection.student;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentsCollectionRunner {

    public static void main(String[] args) {

        List<Student> students = List.of(
                new Student(11,"Khan"),
                new Student(22222,"Moinuddin"),
                new Student(31,"Sohail")
                );

        List<Student> students2 = new ArrayList<>(students);

        System.out.println(students2);

        Collections.sort(students2);
        System.out.println("DSCending"+students2);
        Collections.sort(students2, new AscendingStudentComparator());
        System.out.println("AscendingStudentComparator"+students2);

        System.out.println("******************************************************");
       students2.sort(new AscendingStudentComparator());
        System.out.println("AscendingStudentComparator"+students2);

    }
}
