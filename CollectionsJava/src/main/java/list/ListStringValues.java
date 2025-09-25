package list;

import java.util.*;

public class ListStringValues {

    public static void main(String[] args) {

        List<String> words = List.of("a", "b", "c", "d", "e", "f", "g", "h", "i");
       // words.add("z");//we can't add once declared instaed go with ArrayList, LinkedList, Vector
        System.out.println(words);

        words.size();
        System.out.println(words.size());
        System.out.println(words.isEmpty());
        System.out.println(words.get(0));
        System.out.println(words.contains("a"));
        System.out.println(words.indexOf("a"));
        System.out.println(words.indexOf("z"));

        List<String> wordsArrayList = new ArrayList<String>(words);
        System.out.println(wordsArrayList);
        wordsArrayList.add("Khan");
        System.out.println(wordsArrayList);
        wordsArrayList.add("Elephant");
        System.out.println(wordsArrayList);
        wordsArrayList.add(0, "New York");
        System.out.println(wordsArrayList);
        wordsArrayList.add(0, "New York");
        System.out.println(wordsArrayList);
        List<String> newList = List.of("Yak", "zebra");
        wordsArrayList.addAll(newList);
        System.out.println(wordsArrayList);
        wordsArrayList.set(9, "Mehdipatnam");
        System.out.println(wordsArrayList);
        wordsArrayList.remove(1);
        System.out.println(wordsArrayList);
        wordsArrayList.remove("Mehdipatnam");
        System.out.println(wordsArrayList);

        //1 Approach
        for(int i=0; i<wordsArrayList.size(); i++){
            System.out.println(wordsArrayList.get(i));
        }
        //2 Approach
        for(String word : wordsArrayList){
            System.out.println(word);
        }

        //3 Approach
        Iterator iterator = wordsArrayList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


        List<String> wordsLinkedList = new LinkedList<String>(words);
        System.out.println(wordsLinkedList);
        wordsLinkedList.add("Sohail");
        System.out.println(wordsLinkedList);

        List<String> wordsVector = new Vector<String>(words);
        System.out.println(wordsVector);
        wordsVector.add("Mohammad");
        System.out.println(wordsVector);



/* class ArrayList implements List<E> {
        insertion and Deltion are slower compared to LinkedList
        almost constant time - access

        class LinkedList implements List<E>{
    Elements are doubly linked -forward and backword - to on
            //Iteration is slower than ArrayList
            //Faster Insertion and Deletion
        }*/
        System.out.println("************************************");
        List<String> wordsA1 = new ArrayList<>(wordsArrayList);
        System.out.println(wordsA1);

        for(String word : wordsA1){
            if(word.startsWith("a")){
                System.out.println(word);
            }
        }
//Enhanced forloop it is not recommed to remove or delete from the list
//        for(String word : wordsA1){
//            if(word.endsWith("a")){
//                System.out.println(wordsA1.remove(word));
//            }
//        }

        //Iterator is the best weay to delete
        Iterator<String> iterator1 = wordsA1.iterator();
        while(iterator1.hasNext()){
            if(iterator1.next().endsWith("a")){
                iterator1.remove();
            }
        }

    }
}
