package sampleExample2;

public abstract class Subject {

    public int marks;
    public static final int MIN_MARKS = 0;

    public Subject() {
    }

    public Subject(int marks) {
        this.marks = marks;
    }

    //Concrete method
    public int totalMarks(){
        return 100;
    }

    //abstract method
    public abstract void teach();


    //public static abstract void teach();
    //private abstract void teach();
    //public final abstract class Subject{
    //
    //   }
    //private constructors
    //  private Subject(int marks) {
    //        this.marks = marks;
    //    }
    //we don't have abstract variables
}
