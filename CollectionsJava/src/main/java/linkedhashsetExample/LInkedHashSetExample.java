package linkedhashsetExample;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LInkedHashSetExample {
    public static void main(String[] args) {

        /*
        * HashSet:
        *  1.HashingALgorithm should be used and order of insertion should be maintained
        *  2.duplication and null should not be allowed
        * ArrayDeque,PriorityQueue,TreeSet,HashSet,LinkedHashSet indexedbased insertion is not allowed
         * */

        LinkedHashSet hs = new LinkedHashSet();
        hs.add(100);
        hs.add(50);
        hs.add(150);
        hs.add(25);
        hs.add(75);
        hs.add(125);
        hs.add(125);
        hs.add(null);
        System.out.println(hs);
    }
}
