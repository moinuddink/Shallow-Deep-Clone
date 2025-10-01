package practice2;

import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {

        //Alpha4.Beta.beta();
        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(1, "Java");//key, value --> Entry
        hm.put(2, "Python");
        hm.put(3, "C#");
        System.out.println(hm);
        String data =hm.get(2);
        System.out.println(data);

        System.out.println("*****************************");
       Collection<String> values =hm.values();
     Iterator itr =  values.iterator();
     while(itr.hasNext()){
         System.out.println(itr.next());
     }

        System.out.println("**********************");
//only key
        Set<Integer> set =  hm.keySet();
        Iterator<Integer> itr2 = set.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }

//both key and value entrySet()

        /*Set<Map.Entry<Integer,String>> keySet = hm.entrySet();
        Iterator itr3 = keySet.iterator();
        while(itr3.hasNext()){
            System.out.println(itr3.next());
        }*/

        System.out.println("***********************");
        Set entry = hm.entrySet();
        Iterator itr3 = entry.iterator();
        while(itr3.hasNext()){
            Map.Entry entry2 = (Map.Entry)itr3.next();
            System.out.println("Key: "+entry2.getKey()+" Value: "+entry2.getValue());
        }


    }
}
