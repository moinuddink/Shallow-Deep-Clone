package MulthreadingPart2;

public class LaunchThreads2 {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Main method activity started");

        Alpha a = new Alpha();
        a.addition();
        a.focus();
        a.printingStars();
        System.out.println("Main method activity completed");
    }
}
