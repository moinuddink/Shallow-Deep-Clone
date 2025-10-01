package immutablemapdemo;

import java.util.HashMap;
import java.util.Map;

public class ImmutableMapDemo {
    public static void main(String[] args) {


        Map< String,Integer> stringIntegerMap = Map.of("a",1,"b",2,"c",3);
        processMap(stringIntegerMap);

    }

    public static void processMap(Map<String, Integer> stringIntegerMap)
    {

        for( Map.Entry<String, Integer> entry:stringIntegerMap.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}
