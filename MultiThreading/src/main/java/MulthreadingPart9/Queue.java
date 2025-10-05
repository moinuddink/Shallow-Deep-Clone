package MulthreadingPart9;

public class Queue {

    int data;

    public void produce(int i) {
        data =i;
        System.out.println("I hava produced Data"+data);
    }
    public void consume() {
        System.out.println("I hava consumed Data"+data);
    }
}
