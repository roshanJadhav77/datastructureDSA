package com.datastructure.datastructureDSA.java.java8.functional;

public class RunnableExample {
    public static void main(String[] args) {
        // Runnable – No input, no output
        Runnable logTask = () -> System.out.println("Logging payment transaction...");
        logTask.run();
        // and also use below
        // new Thread(logTask).start();
    }
}
