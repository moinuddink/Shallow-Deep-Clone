package MulthreadingPart4;

public class Beta2 implements Runnable {

    @Override
    public void run(){
        try {
            focus();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void focus() throws InterruptedException {
        System.out.println("Printing important message activity");
        for(int i=0;i<4;i++){
            System.out.println("Focus is the key......");
            Thread.sleep(4000);
        }
        System.out.println("Printing important message activity completed");
    }
}
