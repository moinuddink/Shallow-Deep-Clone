package Practice1;

public class InvalidCustomerException extends Exception {

    //Here Parent of InvalidCustomerException is Exception

    /*
    * so that means all the methods present in the Exception will by default will
    * be present in the InvalidCustomerException
    *
    * so here in the below method there is argument message which is String type
    * of which is message with '
    * */
    public InvalidCustomerException(String message) {
        super(message);
    }
}
