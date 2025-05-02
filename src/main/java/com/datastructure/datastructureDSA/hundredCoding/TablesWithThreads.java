package com.datastructure.datastructureDSA.hundredCoding;

import static java.lang.Thread.sleep;

public class TablesWithThreads {

    public static void  printTable(int n) throws InterruptedException {
        for(int i =1; i <=10 ; i++){
            System.out.println(n+"*"+i+"="+n*i);
            sleep(100);
        }
    }

    public static void main(String[] args) {
       // printTable(2);
      //  printTable(3);

        Runnable t1=() ->{
            try {
                printTable(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        Runnable t2=() ->{
            try {
                printTable(3);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        new Thread(t1).start();
        new Thread(t2).start();

    }
}
