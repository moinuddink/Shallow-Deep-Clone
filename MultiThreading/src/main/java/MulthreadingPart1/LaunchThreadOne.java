package MulthreadingPart1;

public class LaunchThreadOne {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Application Started");

        //Thread.sleep(5000);

     Thread thread =   Thread.currentThread();
        System.out.println("Thread Name: " + thread.getName());//main priority is from 1 to 10
        System.out.println(thread.getPriority());
        Thread.sleep(5000);
        thread.setName("Sohail");
        thread.getName();
        thread.setPriority(4);

        System.out.println("Application terminated");
    }
}
