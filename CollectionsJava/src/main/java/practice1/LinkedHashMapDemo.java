package practice1;

import java.util.LinkedHashMap;
/*
* Key value pair
* key must be unique and value need not to be unique
* key can be null
* value can be null
* */
public class LinkedHashMapDemo {

    public static void main(String[] args) {

        LinkedHashMap<Integer, String> hm = new LinkedHashMap<>();
        hm.put(2, "Java");
        hm.put(1, "Python");
        hm.put(3, "Python");
        hm.put(null, "Python");
        hm.put(5, null);
        System.out.println(hm);

    }
}
