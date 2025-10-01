package Practice1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {

        Comparator<Student> com = new Comparator<Student>() {

            @Override
            public int compare(Student o1, Student o2) {
                if(o1.age>o2.age){
                    return 1;
                }else{
                    return -1;
                }
            }
        };
        List<Student> person = new ArrayList<>();
        person.add(new Student(21,"Navin"));
        person.add(new Student(12,"Mary"));
        person.add(new Student(18,"Jack"));
        person.add(new Student(20,"Kiran"));

        Collections.sort(person,com);
    for (Student student : person) {
        System.out.println(student);
    }

    }

}
