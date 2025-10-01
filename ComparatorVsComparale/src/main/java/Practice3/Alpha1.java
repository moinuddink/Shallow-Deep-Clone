package Practice3;

import java.util.Comparator;

public class Alpha1 implements Comparator<Cricketer> {


    @Override
    public int compare(Cricketer o1, Cricketer o2) {
        if(o1.average > o2.average){
            return 1;
        }else
        {
            return -1;
        }
    }
}
