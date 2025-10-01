package enumoneexample;

public class LaunchEnum1 {

    /*
    * Collection of related constants is called Enums
    * */
    public static void main(String[] args) {

    Week week = Week.MON;//week is its type is value & variable
    System.out.println(week);

        System.out.println("********");
    int index =Week.THU.ordinal();
    System.out.println(index);
        System.out.println("************");
     Week[] value = Week.values();
     for (Week w : value) {
         System.out.println(w.ordinal()+" "+w);
     }

    }
}
