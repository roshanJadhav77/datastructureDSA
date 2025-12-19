package com.datastructure.datastructureDSA.interviewCoding;


import java.util.concurrent.CompletableFuture;

public class CompletableFutureMainSample {

    public static void main(String[] args) {

        CompletableFuture<String> futuresss = CompletableFuture.supplyAsync(() -> {

            try {

                Thread.sleep(3000);

            } catch (InterruptedException e) {

                throw new RuntimeException(e);

            }

            return "Hello";

        });

        futuresss.thenApply(result -> {

            System.out.println("Result: " + result);

            return result + " World";

        });

        try {

            Thread.sleep(1000);

        } catch (InterruptedException e) {

            throw new RuntimeException(e);

        }

        futuresss.join();

        System.out.println("Main thread finished!");

       // System.exit(0);

    }

}