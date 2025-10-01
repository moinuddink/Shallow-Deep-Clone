package Practice1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PracticeStudent {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Navin","Harsh","John");

        List<Student> students = new ArrayList<>();

       /* for(String name: names) {
            students.add(new Student());
        }*/

//    students=  names.stream().map(name -> new Student(name))
//                      .toList();

        students = names.stream().map(Student::new).toList();

        System.out.println(students);
    }

}
