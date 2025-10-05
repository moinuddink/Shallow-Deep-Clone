package listiteratorexample;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class    ListIteratorExample {

    public static void main(String[] args) {

        CopyOnWriteArrayList al = new CopyOnWriteArrayList();
        al.add(100);
        al.add(200);
        al.add(300);
        al.add(400);

      /*  Iterator itr = al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
            al.add(44);//fail safe-->
        }*/

      ListIterator litr = al.listIterator(al.size());//backdoor of the collection
        while(litr.hasPrevious()){//while-->as long as
            System.out.println(litr.previous());
        }
    }
}
