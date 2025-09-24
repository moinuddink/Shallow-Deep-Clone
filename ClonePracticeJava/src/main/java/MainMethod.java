public class MainMethod {

    public static void main(String[] args) {
       Abc abc = new Abc();
       abc.i=10;
       abc.j=20;
       Abc abc1 = abc;

        System.out.println(abc);
       abc1.j=40;
       System.out.println(abc1);

    }
}
