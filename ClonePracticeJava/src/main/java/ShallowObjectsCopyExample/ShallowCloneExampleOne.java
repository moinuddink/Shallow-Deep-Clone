package ShallowObjectsCopyExample;

public class ShallowCloneExampleOne {

    public static void main(String[] args) {
        A obj = new A();
        obj.i = 5;
        obj.j = 6;

        A obj1 = new A();
        obj1.i = 7;
        obj1.j = 8;
        System.out.println(obj);
        System.out.println(obj1);


    }
}
