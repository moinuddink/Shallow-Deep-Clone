package Practice3;

public class ExceptionHandlingJava {

    public static void main(String[] args) {
       /*<--In Java if need arises can we create the custom excepetions -->
       * Yes
       *
       * 1.try and catch you can't write to handle the "Errors"
       * 2.try and catch you can write to handle only  the exceptions
       *  */
        RTO rto = new RTO();
        rto.initiate();
    }
}
