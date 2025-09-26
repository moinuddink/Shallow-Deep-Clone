package Practice3;

public class LuanchEh1 {

    public static void main(String[] args) {
        try{
            Demo1 demo1 = new Demo1();
            demo1.division();
            demo1.disp();
        }catch (Exception e){
            System.out.println("Exception Occured at main");
        }
    }
}
