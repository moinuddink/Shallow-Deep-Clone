package MulthreadingPart9;

public class LaunchInterThread {
    public static void main(String[] args) {

        //Association

        Queue q = new Queue();
        Producer p = new Producer(q);

        Consumer c = new Consumer(q);


    }
}
