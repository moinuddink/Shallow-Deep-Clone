package enumoneexamplebehindthescenes;

public enum Result {
    /*
    * When ever you create this ENUM Result class at the back there will be one class created as below
    * class Result extends Enum
    * here again the Enum will extends Object class
    * so all the methods of Enum and Object will sit in the class Result class
    * Constants means final
    * */
    PASS,FAIL,SUCCESS;
    /*
    * public static final Result PASS = new Result();
    * public static final Result FAIL = new Result();
    * public static final Result SUCCESS = new Result();
    * */

    Result() {
        System.out.println("Result Intance/Object is created");
    }

    int marks;

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    /*
    *
    * In Java, an enum(short for "enumeration") is a special class that represents a group
    * of constants(unchangeable variables). it is used to define a collection of related constants,
    * like days of the week, months, or states in a process
    * */
}
