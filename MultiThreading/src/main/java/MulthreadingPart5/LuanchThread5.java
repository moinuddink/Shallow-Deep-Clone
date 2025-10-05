package MulthreadingPart5;

public class LuanchThread5 {
    public static void main(String[] args) {

        Telusko telusko = new Telusko();
        Thread thread1 = new Thread(telusko);
        Thread thread2 = new Thread(telusko);
        Thread thread3 = new Thread(telusko);


        thread1.setName("Add");
        thread2.setName("Focus");
        thread3.setName("STAR");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
