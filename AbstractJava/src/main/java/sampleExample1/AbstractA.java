package sampleExample1;

public abstract class AbstractA {

    /* we cannot have instance variables as abstract
    public abstract String = "String";
    public abstract int value = 23;
    public abstract String test();
    abstract don't have same methods
    private is not allowed in the abstract
    protected is allowed for the abstract methods
    If the extending class is concrete class then we need to implement all the methods present in parent class of abstract or else declare the subclass as abstract
    */

    public AbstractA() {
        System.out.println("Here is the abstraction class in AbstractA");
    }

    public abstract void exampleOfAbs();

    public void scoreOfCricket() {
        int score = 0;
    }



}
