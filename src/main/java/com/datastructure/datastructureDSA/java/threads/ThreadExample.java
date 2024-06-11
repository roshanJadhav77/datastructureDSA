package com.datastructure.datastructureDSA.java.threads;

public class ThreadExample {
    public static void main(String[] args) {

        Thread t = new Thread();
        Thread t1 = new Thread();
        Thread t2 = new Thread();
        Thread t3 = new Thread();
        Thread t4 = new Thread();


       System.out.println("Thread ID = "+ t.getId());
       System.out.println("Thread NAME = "+ t.getName());
       System.out.println("Thread PRIORITY = "+ t.getPriority());

       System.out.println("Set Name");
       t1.setName("rosh");

       t1.setPriority(1);
       System.out.println("Set Priority "+t1.getPriority());

        System.out.println("Set Name");
        t2.setName("jadhav");

        t2.setPriority(3);
        System.out.println("Set Priority "+t2.getPriority());
        System.out.println("Set Name "+t2.getName());


        t3.setName("Anil");
        System.out.println("Set Name "+t3.getName());

        t3.setPriority(2);
        System.out.println("Set Priority "+t3.getPriority());


        t4.setName("kavita");
        System.out.println("Set Name "+t4.getName());

        t4.setPriority(4);
        System.out.println("Set Priority "+t4.getPriority());

    }
}
