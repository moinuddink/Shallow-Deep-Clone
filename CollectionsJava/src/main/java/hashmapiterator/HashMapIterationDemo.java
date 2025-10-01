package hashmapiterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapIterationDemo {

    public static void main(String[] args) {

        var countryMap = new HashMap<String, String>();
        countryMap.put("India","New Delhi");
        countryMap.put("USA","United States");
        countryMap.put("France","Paris");
        approach1(countryMap);

    }

    public static void approach1(HashMap<String,String> countryMap)
    {
     Set<String> keys =   countryMap.keySet();

   Iterator<String> itr =keys.iterator();
   while (itr.hasNext()) {
       String key = itr.next();
       String value = countryMap.get(key);
       System.out.println(key+" : "+value);
   }
           /*  for(String key:keys){
               String capital =  countryMap.get(key);
               System.out.println(key + ": " + capital);
             }*/
    }
}
