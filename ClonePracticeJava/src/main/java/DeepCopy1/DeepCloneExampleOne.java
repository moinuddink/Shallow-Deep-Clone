package DeepCopy1;

public class DeepCloneExampleOne {
    public static void main(String[] args) {

        Aa obj = new Aa();
        obj.age = 18;
        obj.id =23;

        Aa obj1 = new Aa();
        obj1.age = obj.age;
        obj1.id = obj.id;

        System.out.println(obj1);
    }
}
