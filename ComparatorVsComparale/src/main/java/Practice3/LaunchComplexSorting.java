package Practice3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//implements
//anonymous inner class
//Lambda
public class LaunchComplexSorting {
    public static void main(String[] args) {

        Cricketer cl = new Cricketer(34, "Sohail", 100.5);
        Cricketer cl2 = new Cricketer(36, "Moinuddin", 85.5);
        Cricketer cl3 = new Cricketer(30, "Mohammad", 65.5);

        ArrayList<Cricketer> al = new ArrayList<>();
        al.add(cl);
        al.add(cl2);
        al.add(cl3);
        System.out.println(al);

        /*Comparator<Cricketer> comp = new Comparator<>() {


            @Override
            public int compare(Cricketer o1, Cricketer o2) {
                if(o1.age > o2.age){
                    return 1;
                }else
                {
                    return -1;
                }
            }
        };*/
        Alpha1 alpha = new Alpha1();

        Comparator<Cricketer> compLa = (Cricketer o1, Cricketer o2) -> {
            if(o1.average > o2.average){
                return 1;
            } else {
                return -1;
            }
        };

        //Collections.sort(al, alpha);
        //Collections.sort(al, comp);
        Collections.sort(al, compLa);
        System.out.println(al);

        System.out.println(al);


    }
}
