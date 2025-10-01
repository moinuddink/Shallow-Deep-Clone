package practice1;

import java.util.TreeMap;

public class TreeMapExampe {

    /*
    * the mostly used class is hashmap
    * the data store in treemap is sorted
    * key can't be null(at compile tim no problem but at runtime is the exception)
    * */
    public static void main(String[] args) {

        TreeMap tm = new TreeMap();
        tm.put(3, "Hibernate");
        tm.put(2, "Java");
        tm.put(null, "SpringBoot");//Key cann't be null
        tm.put(4, null);//value can be null
        System.out.println(tm);//-->{2=Java, 3=Hibernate}


    }
}
