package com.datastructure.datastructureDSA.java.threads;

public class ThreadSleep extends Thread{

    public static void main(String[] args) {

        System.out.println("Main method started");

        ThreadSleep sleep1 = new ThreadSleep();
        ThreadSleep sleep2 = new ThreadSleep();

        sleep1.start();
        sleep2.start();

        System.out.println("Main method ended");

    }
    public void run() {

        System.out.println("Printing number.numbers from 1 to 25");

        for (int i = 1; i <= 25; i++)
        {
            System.out.println("i = "+i);

        }
        try{
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
