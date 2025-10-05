package collection2;

import java.util.PriorityQueue;

public class LaunchPriorityQueueExample {

    public static void main(String[] args) {
/*
* ArrayDeque,PriorityQueue,TreeSet,HashSet,LinkedHashSet indexedbased insertion is not allowed
* Iterator is allowed
* Duplicated are allowed
* null is not allwed
* same datatype of elements are allowed in this module
* */
        PriorityQueue priorityQueue = new PriorityQueue();
        priorityQueue.add(41);
        priorityQueue.add(532);
        priorityQueue.add(126);
        priorityQueue.add(732);
        priorityQueue.add(811);
        priorityQueue.add(1119);
        System.out.println(priorityQueue);

    }
}
