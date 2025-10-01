package Practice4;

import Practice3.Cricketer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LaunchComplexSorting2 {

    public static void main(String[] args) {

        Cricketer c1 = new Cricketer(46,"Moinuddin ",100.5);
        Cricketer c2 = new Cricketer(38,"Sami",88.5);
        Cricketer c3 = new Cricketer(3,"Ibrahim",95.5);
        Cricketer c4 = new Cricketer(26,"Sadiya",15.5);

        ArrayList<Cricketer> all = new ArrayList<>();
        all.add(c1);
        all.add(c2);
        all.add(c3);

        System.out.println(all);


    }
}
