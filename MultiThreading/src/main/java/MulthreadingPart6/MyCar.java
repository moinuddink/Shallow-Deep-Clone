package MulthreadingPart6;

public class MyCar implements Runnable {
    @Override
   synchronized public void run() {
        try
        {
            System.out.println(Thread.currentThread().getName()+" has entered parking lot");
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName()+" has entered into car ");
            Thread.sleep(5000);
            synchronized (this)//block level locking
            {
                System.out.println(Thread.currentThread().getName() + " has started to drive car ");
                Thread.sleep(5000);
                System.out.println(Thread.currentThread().getName() + " has come back and parked the car ");
            }
            Thread.sleep(5000);
        } catch (Exception e) {
            System.out.println("Exception occured");
        }
    }
}
