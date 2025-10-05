package MulthreadingPart8;

public class LuanchMain {
    public static void main(String[] args) {

        Library lib = new Library();

        Thread t1 = new Thread(lib);
        Thread t2 = new Thread(lib);

        t1.setName("Rohan");//giving name to thread
        t2.setName("Bishnu");

        t1.start();//giving life to thread
        t2.start();
    }
}
