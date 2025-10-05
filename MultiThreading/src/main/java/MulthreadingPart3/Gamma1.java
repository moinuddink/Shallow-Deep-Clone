package MulthreadingPart3;

public class Gamma1 extends Thread {

    @Override
    public void run() {
        try {
            printingStars();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void printingStars() throws InterruptedException {
        System.out.println("Printing stars activity started");
        for(int i=0;i<4;i++){
            System.out.println(" * *");
            Thread.sleep(4000);
        }
        System.out.println("Printing stars activity completed");
    }
}
