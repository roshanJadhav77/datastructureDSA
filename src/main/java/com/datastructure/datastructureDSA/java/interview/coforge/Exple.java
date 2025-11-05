package com.datastructure.datastructureDSA.java.interview.coforge;

public class Exple {
    public static void main(String[] args) {

        Print printer = new Print(10);

        Runnable task1 = () -> printer.print(1);
        Runnable task2 = () -> printer.print(2);
        Runnable task3 = () -> printer.print(3);
        new Thread(task1, "Thead 1").start();
        new Thread(task2, "Thead 2").start();
        new Thread(task3, "Thead 3").start();

        /*Thread t1 = new Thread(() -> printer.print(1), "Thread 1");
        Thread t2 = new Thread(() -> printer.print(2), "Thread 2") ;
        Thread t3 = new Thread(() -> printer.print(3),"Thread 3") ;

        t1.start();
        t2.start();
        t3.start();*/
    }

}
