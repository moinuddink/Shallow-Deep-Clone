package com.clone;

public class CloneMainExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        Teacher teacher = new Teacher();
        teacher.age=18;
        teacher.gender='M';

        System.out.println(teacher);

          Teacher status  = (Teacher) teacher.clone();
          System.out.println(status);

    }
}
