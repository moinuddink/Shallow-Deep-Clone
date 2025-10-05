package MulthreadingPart3;

public class LaunchMainMethod {
    public static void main(String[] args) throws InterruptedException {
        Alpha1 alpha1 = new Alpha1();
        alpha1.addition();
        Beta1 beta1 = new Beta1();
        beta1.focus();
        Gamma1 gamma1 = new Gamma1();
        gamma1.printingStars();

        alpha1.start();
        beta1.start();
        gamma1.start();

        //iterview question what will have happen if a developer calls run method manually
      /*  alpha1.run();
        beta1.run();
        gamma1.run();*///--> single threaded programming


    }
}
