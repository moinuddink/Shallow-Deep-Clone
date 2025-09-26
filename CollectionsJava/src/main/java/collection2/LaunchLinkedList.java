package collection2;

import java.util.LinkedList;

public class LaunchLinkedList {

    public static void main(String[] args) {


        /*
        * LinkedList Maintains the order of insertion
        *
        * */
        LinkedList linkedList = new LinkedList();
        linkedList.add(44);
        linkedList.add(22);
        linkedList.add(33);
        System.out.println(linkedList);
        linkedList.addFirst(44);
        linkedList.addFirst(null);
        System.out.println(linkedList);

        linkedList.offer("Java");
        linkedList.offerFirst("Java");
        linkedList.offerLast("Spring");
        System.out.println(linkedList);


        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());
        System.out.println(linkedList);

        System.out.println(linkedList.pollFirst());
        System.out.println(linkedList.pollLast());
        System.out.println(linkedList);

        linkedList.push("JavaSpringBoot");
        System.out.println(linkedList);
        linkedList.pop();
        System.out.println(linkedList);

        /*linkedList.stream();
        linkedList.iterator();
        linkedList.forEach();*/




    }
}
