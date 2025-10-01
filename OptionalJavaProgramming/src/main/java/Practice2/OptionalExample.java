package Practice2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("John", "Mary", "Jane","Navin","Laxshmi","Kishor");

        //Print the names which as x letter in their names
        //Optional cames into existance from Java 1.8 which is mainly used to handle the Null Pointer Exception

     /*Optional<String> name= names.stream()
                .filter(str -> str.contains("x"))
                .findFirst();*/

       String name= names.stream()
                .filter(str -> str.contains("x"))
                .findFirst()
               .orElse("Nothing Found");

     System.out.println(name);

     //2n Secenario in case if there is no letter x in the given strings then in that case we will get below error
        /*Exception in thread "main" java.util.NoSuchElementException: No value present
        at java.base/java.util.Optional.get(Optional.java:143)
        at Practice2.OptionalExample.main(OptionalExample.java:20)*/

        //So now if you want to avoid this

//        System.out.println(name.orElse("Not Found"));//after you this line of code you have to comment out this code -->System.out.println(name.get());

    }
}
