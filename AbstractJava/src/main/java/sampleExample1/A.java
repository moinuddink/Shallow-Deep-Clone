package sampleExample1;

public class A extends AbstractA{
    @Override
    public void exampleOfAbs() {
        System.out.println("I hava implemented Abstraction");
    }
    
   

    public static void main(String[] args) {
        AbstractA obj = new A();
        obj.exampleOfAbs();
        obj.scoreOfCricket();

    }
    
}
