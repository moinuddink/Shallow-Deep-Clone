package Practice2;

public class ExceptionHandlingExample {
    //Unchecked Exception:is such a exception compiler will not check for the possibility of exception it is on
    //on the head of developer(has to anciticipate and analys the code)

    /*
    * Checked Exception: compiler will check and say that there is a possiblity of exception
    *
    * Interview asked question: Exception always happens at runtime
    *
    * Throwable:is a class(Predefined class)
    *
    * what is NullpointerException?
    * */

    public static void main(String[] args) throws Exception {
        System.out.println("Application Started");

        Thread.sleep(6000);


        System.out.println("Application Terminate");
    }
}
