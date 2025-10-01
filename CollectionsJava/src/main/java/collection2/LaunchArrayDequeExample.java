package collection2;

import java.util.ArrayDeque;

public class LaunchArrayDequeExample {
    public static void main(String[] args) {

        /*
        *ArrayDeque maintains the order of insertion
        * Maintains the duplicate values
        * we can't add the null data
        *
        * 1) Interview question-->index based insertion is not allowed
        * if you want to do perform the insertion at the front end and rear end where index based insertion is not allowed which collection
        * class will you use -->ArrayDeque
        * ArrayDeque,PriorityQueue,TreeSet,HashSet,LinkedHashSet indexedbased insertion is not allowed
        * */
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(4);
        arrayDeque.add(5);
        arrayDeque.add(55);
        arrayDeque.add(54);
        arrayDeque.add(54);
        arrayDeque.add(54);
        arrayDeque.add(54);
       // arrayDeque.add(null); -->Null data can't be added
        arrayDeque.addFirst(1);
        arrayDeque.addLast(2546486464L);

        System.out.println(arrayDeque);
    }
}
