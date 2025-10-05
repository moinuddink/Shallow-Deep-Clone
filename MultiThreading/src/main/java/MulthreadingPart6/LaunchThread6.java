package MulthreadingPart6;

public class LaunchThread6 {
    public static void main(String[] args) throws InterruptedException {
        MyCar myCar = new MyCar();

        Thread thread1 = new Thread(myCar);//Thread1
        Thread thread2 = new Thread(myCar);
        Thread thread3 = new Thread(myCar);

        thread1.setName("Sohail");
        thread2.setName("Ibrahim");
        thread3.setName("Sadiya");

        System.out.println(thread1.isAlive());
        System.out.println(thread2.isAlive());
        System.out.println(thread3.isAlive());
        
        thread1.start();//life to thread
        thread2.start();
        thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();

        System.out.println(thread1.isAlive());
        System.out.println(thread2.isAlive());
        System.out.println(thread3.isAlive());
    }
}
