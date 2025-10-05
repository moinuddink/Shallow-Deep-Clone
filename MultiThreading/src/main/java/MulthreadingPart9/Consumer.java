package MulthreadingPart9;

public class Consumer extends Thread {

    Queue q;

    public Consumer(Queue q) {
        this.q = q;
    }

    @Override
    public void run() {

        q.consume();
    }
}
