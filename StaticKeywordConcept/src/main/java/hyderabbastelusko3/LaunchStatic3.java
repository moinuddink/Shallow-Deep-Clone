package hyderabbastelusko3;

public class LaunchStatic3 {

    public static void main(String[] args) {
        Alien a = new Alien();//object number 1
//        System.out.println(a.count);
        System.out.println(Alien.count);
        Alien b = new Alien(16);//object number 2
//        System.out.println(b.count);
        System.out.println(Alien.count);
        Alien c = new Alien();//object number 3
//        System.out.println(c.count);
        System.out.println(Alien.count);

    }
}
