package hyderabbastelusko4;

public class LaunchStatic4 {
    public static void main(String[] args) {

        Farmer farmer = new Farmer();
        Farmer farmer2 = new Farmer();
        Farmer farmer3 = new Farmer();

        System.out.println("Faremer 1");
        farmer.input();
        farmer.findSI();
        farmer.dispSI();

        System.out.println("Farmer2 ");
        farmer2.input();
        farmer2.findSI();
        farmer2.dispSI();
        System.out.println("Farmer3 ");
        farmer3.input();
        farmer3.findSI();
        farmer3.dispSI();
    }
}
