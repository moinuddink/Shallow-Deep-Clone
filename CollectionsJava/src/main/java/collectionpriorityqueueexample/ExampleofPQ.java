package collectionpriorityqueueexample;

import java.util.Iterator;
import java.util.PriorityQueue;

public class ExampleofPQ {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue();
        pq.add(5);
        pq.add(1);
        pq.add(8);
        pq.add(3);
        pq.add(10);
        pq.add(2);
        System.out.println(pq);

       Iterator itr = pq.iterator();
       while (itr.hasNext()) {
           System.out.println(itr.next());
       }
    }
}
