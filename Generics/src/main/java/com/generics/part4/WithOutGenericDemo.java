package com.generics.part4;

import java.util.ArrayList;

public class WithOutGenericDemo {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Hello");
        list.add(1);
        list.add(true);
        list.add(null);

       String greeting=(String) list.get(0);
        int number=(Integer) list.get(1);
        boolean flat = (Boolean) list.get(2);

        //with Generic


        ArrayList<String> list1 = new ArrayList();
        list1.add("Hello");//with generic type safety or compile time check which will save us from manual casting and castcastexception


        String greeting1= list1.get(0);
        /*int number=(Integer) list.get(1);
        boolean flat = (Boolean) list.get(2);*/
    }
}
