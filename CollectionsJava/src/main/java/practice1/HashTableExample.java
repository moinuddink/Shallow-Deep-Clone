package practice1;

import java.util.Hashtable;

public class HashTableExample {

    /*
    * Key cann't be null
    * value can be null
    * */
    public static void main(String[] args) {

        Hashtable ht = new Hashtable();
        ht.put(2, "Java");
       // ht.put(null, "SpringBoot");
        //ht.put(4, null);
        ht.put(3, "Java");
        System.out.println(ht);
    }
}
