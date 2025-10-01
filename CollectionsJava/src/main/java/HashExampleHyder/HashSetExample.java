package HashExampleHyder;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
/*
*1.searching is O(1) without delay it loook and search if it is there or not
* 2.Duplicates in any of this set based classes Treeset,hashset,linkedhashset are not allowed
* 3.Treeset is where we store the elements in the sorted order
* 4.hashset is class where null and duplicates both are not allowed
* ArrayDeque,PriorityQueue,TreeSet,HashSet,LinkedHashSet indexedbased insertion is not allowed
* ArrayDeque,PriorityQueue,TreeSet,HashSet,LinkedHashSet indexedbased accessing is not allowed
*
*  */
        HashSet hs = new HashSet();
        hs.add(100);
        hs.add(50);
        hs.add(150);
        hs.add(25);
        hs.add(75);
        hs.add(125);
        System.out.println(hs);


    }

}
