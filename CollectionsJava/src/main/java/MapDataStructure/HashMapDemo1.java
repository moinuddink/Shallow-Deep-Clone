package MapDataStructure;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo1 {

    public static void main(String[] args) {

        //var countryMap = new HashMap<>();
        Map<String,String> countryMap = new HashMap<>();//1.Map Object it is one of the way to create
        //HashMap<String,String> countryMap = new HashMap<>();//2.2nd way of creating HashMap Object
        //var countryMap = new HashMap<String, String>();//3. 3rd way of creating HashMap Object


        countryMap.put("India","New Delhi");
        countryMap.put("USA","Washington, DC");
        countryMap.put("France","Paris");
        countryMap.put(null,null);//for the key duplicates are not allowed

        System.out.println(countryMap.get("India"));
        countryMap.remove(null,null);
        System.out.println(countryMap.size());
        System.out.println(countryMap);

        //Interview Question: How the HashMap stores the datea internally?
        /*
         * Map:-> internal working of HashMap
         * Object:JVM will create few buckets by index numbers hashmap can be store in any order
         * */
    }
}
