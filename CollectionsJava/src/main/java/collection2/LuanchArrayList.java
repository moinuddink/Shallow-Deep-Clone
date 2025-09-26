package collection2;

import java.util.ArrayList;

public class LuanchArrayList {
    public static void main(String[] args) {

        //ArrayList ->Dynamic array DS

        /*
        * ArrayList maintains the order of insertion
        * */
        ArrayList aList = new ArrayList(); //-->aList is the collection
        aList.add(44);//Object o = new Integer(44);
        aList.add("Sohail");//Object o = new String("Sohail");
        aList.add(45.34);//Object o = new Double(45.34);
        aList.add(true);//Object o = new Boolean(true);

        System.out.println(aList);
        aList.add(null);
        System.out.println(aList);
        System.out.println("************************************");

        ArrayList aList2 = new ArrayList();
        aList2.add(44);
        aList2.add(454);
        aList2.add(454.4);
        aList2.add(65);

        System.out.println(aList2);

        aList2.addAll(aList);//Using the addAll method we can add one collection into another collection
        System.out.println(aList2);

        //based on index

        aList2.add(1,"Moinuddin");
        System.out.println(aList2);

    }
}
