package MulthreadingPart9;

public class Producer extends Thread {

    Queue q;
    int i;

    public Producer(Queue q) {
        this.q = q;
    }

    @Override
    public void run() {

        q.produce(i);
    }
}
