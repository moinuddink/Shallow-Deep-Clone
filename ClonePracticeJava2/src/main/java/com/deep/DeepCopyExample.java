package com.deep;

public class DeepCopyExample {

    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.i=34;
        manager.j=40;

        System.out.println(manager);
        Manager manager1 = new Manager();
        manager1.i=manager.i;
        manager1.j=manager.j;

        System.out.println(manager1);
    }
}
