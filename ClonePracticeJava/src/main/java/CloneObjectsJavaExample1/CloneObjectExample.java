package CloneObjectsJavaExample1;

public class CloneObjectExample {

    public static void main(String[] args) throws CloneNotSupportedException {
        Abc obj = new Abc();
        obj.age = 18;
        obj.score = 23;

      Abc obj1 =(Abc) obj.clone();
      System.out.println(obj1);
    }
}
