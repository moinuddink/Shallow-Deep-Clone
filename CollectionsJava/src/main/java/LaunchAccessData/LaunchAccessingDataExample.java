package LaunchAccessData;

import java.util.ArrayList;
import java.util.Iterator;

public class LaunchAccessingDataExample {

    public static void main(String[] args) {

        /*
        * ArrayDeque,PriorityQueue,TreeSet,HashSet,LinkedHashSet indexedbased insertion is not allowed
        * ArrayDeque,PriorityQueue,TreeSet,HashSet,LinkedHashSet indexedbased accessing is not allowed
        * */
       ArrayList al = new ArrayList();
       al.add(100);
       al.add(200);
       al.add(300);
       al.add(400);

     Integer iData = (Integer) al.get(2);
        System.out.println(iData);



     for(int i=0; i<al.size();i++){
//         Integer dat = (Integer) al.get(i);
         System.out.println(al.get(i));
     }

     /*
     * whenever if you want to access the data which is there in you collection it highly recommended to go with iterator
     *
     * if it is list based classes you multiple options listiterator where you can iterate reverse also and forward also and
     * rest of the classes only iterator object also where you can iterate from the forward direction
     *
     * what is that Concurrent and structural modification?
     *adding a new data to the collection is called Concurrent modification
     *(When your traversing and accessint the data at that time you want to do some operation like adding and modifiying the collection)
     *
     * */
     for( Object o : al){
         System.out.println(o);
     }
/*
* what is the use of iterator object in java?
* to iterate through collections because there are no bounderies in collection
*
* */
    Iterator itr= al.iterator();
     while(itr.hasNext()){
         System.out.println(itr.next());
         al.add(44);//fail fast -->leading to exception ConcurrentModificationException
     }

    }
}
