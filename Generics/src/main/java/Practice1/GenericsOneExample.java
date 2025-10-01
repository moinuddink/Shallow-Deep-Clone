package Practice1;

import java.util.ArrayList;

public class GenericsOneExample {

    public static void main(String[] args) {
        ArrayList<Telusko> telusko = new ArrayList<>();
        telusko.add(new Telusko(1,"AWS",5665.4));
        telusko.add(new Telusko(2,"SpringBoot",566.4));
        telusko.add(new Telusko(3,"DevOps",5665.4));

        for (Telusko telusko1 : telusko) {
            System.out.println(telusko1);
        }
    }
}
