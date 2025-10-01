package hashmapiterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapIterationDemoApproach2 {

    public static void main(String[] args) {

        var countryMap = new HashMap<String, String>();
        countryMap.put("India","New Delhi");
        countryMap.put("USA","United States");
        countryMap.put("France","Paris");
        approach2(countryMap);

    }

    public static void approach2(HashMap<String,String> countryMap)
    {
     Set<Map.Entry<String, String>> entries =   countryMap.entrySet();

   Iterator<Map.Entry<String, String>> itr =entries.iterator();
   while (itr.hasNext()) {
      Map.Entry<String,String> entry = itr.next();
       String key = entry.getKey();
       String capital = entry.getValue();
       System.out.println(key+" : "+capital);
   }
        System.out.println("**********************");
           /*  for(String key:keys){
               String capital =  countryMap.get(key);
               System.out.println(key + ": " + capital);
             }*/

          for( Map.Entry<String,String> entry:entries){
               String key = entry.getKey();
               String capital =  entry.getValue();
               System.out.println(key + ": " + capital);
             }
    }
}
