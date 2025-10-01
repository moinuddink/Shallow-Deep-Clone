package annotations1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface CricketPlayer {

    String country() default "india";
    int age() default 18;
    /*
    *public @interface CricketPlayer
    *
    * @ --> specifies compiler that annotation type is being creating
    *
    * RetentationPolicy
    * CLASS-->compiletime
    * RUNTIME->JVM
    * SOURCE->Developer
    *
    * Target(ElementType.FIELD)-->Instance variable
    * @Target(ElementType.TYPE)-->class
    * */
}
