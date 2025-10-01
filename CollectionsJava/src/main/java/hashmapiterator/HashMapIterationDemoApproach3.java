package hashmapiterator;

import java.util.*;

public class HashMapIterationDemoApproach3 {

    public static void main(String[] args) {

        var countryMap = new HashMap<String, String>();
        countryMap.put("India","New Delhi");
        countryMap.put("USA","United States");
        countryMap.put("France","Paris");
        approach3(countryMap);

    }

    public static void approach3(HashMap<String,String> countryMap)
    {
     Collection<String> values =   countryMap.values();

             for(String value:values){
               System.out.println(value);
             }
    }
}
