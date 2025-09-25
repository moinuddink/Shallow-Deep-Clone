package com.abstractexample2;

import sampleExample2.Subject;

public abstract class Mathematics extends Subject {

    /*in abstract class abstract variable are not declared
    * */
    public Mathematics() {
       this(Subject.MIN_MARKS);
    }

    public Mathematics(int marks) {
        super(marks);
    }

    @Override
    public void teach() {
        System.out.println("Teaching here is Mathematics");
    }


    /* static is not alled here
    public abstract static geometryStudy();*/

    //Making class as final and contructor as private is not allowed in abstract class

}
