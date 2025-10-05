package hyderabbastelusko3;

public class Alien {

    int age;

   static int count;

    {
        count++;
        System.out.println("Non static block");
    }
    public Alien() {
        age = 16;

    }

    public Alien(int age) {
        this.age = age;

    }


}
