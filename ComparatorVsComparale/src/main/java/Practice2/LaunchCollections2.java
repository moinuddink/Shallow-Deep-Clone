package Practice2;

import java.util.ArrayList;
import java.util.Collections;

public class LaunchCollections2 {
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        al.add(100);
        al.add(50);
        al.add(150);
        al.add(25);
        al.add(75);
        al.add(125);

        System.out.println(al);

        /*
        * TreeSet will sort the data in sorted order format
        *
        * Here the data is in ArrayList in the arraylist do we have any sort method the anwer is no but we have sort with comparator
        *
        * Arrays we have concept of array
        *
        *
        * */

        Collections.sort(al);
        System.out.println(al);

       /* ArrayList<String> al2 = new ArrayList<>();
        al2.add("Java");
        al2.add("Python");
        al2.add("C#");
        al2.add("C++");
        System.out.println(al2);
        Collections.sort(al2);
        System.out.println(al2);*/

        Collections.shuffle(al);
        System.out.println(al);

     int result =   Collections.frequency(al,150);//to check the value of 150 how many times its present
     System.out.println(result);



    }
}
