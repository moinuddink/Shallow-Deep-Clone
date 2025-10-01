package passportapplication;

import java.util.*;

public class MapPassportApplication {
    public static void main(String[] args) {

        System.out.println("PassportApplication");
        Passport pass1 = new Passport("Rohan", "Bengaluru","India");
        Passport pass2 = new Passport("Rohit", "Mumbai","India");
        Passport pass3 = new Passport("Roman", "Phenix","USA");

        Integer id1 = Integer.valueOf(101);
        Integer id2 = Integer.valueOf(102);
        Integer id3 = Integer.valueOf(103);

       HashMap<Integer,Passport> hm=new HashMap<>();
       hm.put(id1, pass1);
       hm.put(id2, pass2);
       hm.put(id3, pass3);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter passport");
        Integer id = scanner.nextInt();
        Set<Map.Entry<Integer,Passport>> entry =hm.entrySet();
        Boolean flag=false;
       Iterator<Map.Entry<Integer, Passport>> itr =entry.iterator();
       while(itr.hasNext()){
           Map.Entry<Integer,Passport> entry1 =itr.next();
           Integer key1 = entry1.getKey();
           if(key1.equals(id)){
               System.out.println("Please Find Your Info Below");
               Passport pass = entry1.getValue();
               System.out.println(pass);
               flag=true;
           }
           System.out.println("Loop is repeating");
       }
       if(!flag){
           System.out.println("No Passport Found");
       }


    }
}
