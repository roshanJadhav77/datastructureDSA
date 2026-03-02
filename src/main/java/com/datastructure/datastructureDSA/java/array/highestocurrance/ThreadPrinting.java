package com.datastructure.datastructureDSA.java.array.highestocurrance;

public class ThreadPrinting {
    public static void main(String[] args) {

        ThreadPrinting threadPrinting = new ThreadPrinting();

        new Thread(() -> threadPrinting.print(0)).start();
        new Thread(() -> threadPrinting.print(1)).start();
        new Thread(() -> threadPrinting.print(2)).start();
        new Thread(() -> threadPrinting.print(3)).start();

    }

    private int num = 1;
    private final int N = 10;

    public synchronized void print(int threadId) {
        while (num <= N) {
            while (num % 3 != threadId && num <= N) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            if (num <= N) {
                System.out.println("THREAD - " + threadId + " : " + num++);
                notifyAll();
            }
        }
    }

}
