package Practice2;

public class DuckingExceptionMain {
    public static void main(String[] args) {

        try{
           DuckingException duckingException = new DuckingException();
           duckingException.division();
       }catch (Exception e){
           System.out.println("Exception is caught at main");
       }
    }
}
