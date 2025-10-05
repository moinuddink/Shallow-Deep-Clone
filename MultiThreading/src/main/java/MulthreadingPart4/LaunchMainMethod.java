package MulthreadingPart4;

import MulthreadingPart3.Alpha1;
import MulthreadingPart3.Beta1;
import MulthreadingPart3.Gamma1;

public class LaunchMainMethod {
    public static void main(String[] args) throws InterruptedException {
        Alpha2 alpha2 = new Alpha2();
        alpha2.addition();
       Beta2 beta2 = new Beta2();
        beta2.focus();
       Gamma2 gamma2 = new Gamma2();
        gamma2.printingStars();


        Thread t1 = new Thread(alpha2);
        t1.start();
        Thread t2 = new Thread(beta2);
        t2.start();
        Thread t3 = new Thread(gamma2);
        t3.start();

        //iterview question what will have happen if a developer calls run method manually
      /*  alpha1.run();
        beta1.run();
        gamma1.run();*///--> single threaded programming


    }
}
