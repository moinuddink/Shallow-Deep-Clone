package com.singletonpattern1;

public class Singleton {

    public static void main(String[] args) {

        Thread thread = new Thread(new Runnable() {
            public void run() {
                A obj1 = A.getInstance();
            }
        });

        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                A obj1 = A.getInstance();
            }
        });

      thread.start();
      thread1.start();


    }
}
