package com.datastructure.datastructureDSA.java.interview.coforge;

public class Print {
    private  int number = 1;
    private final int max;
    private int t =1;

    public Print(int max) {
        this.max = max;
    }

    public void print(int  threadNumber){
        while(true) {
            synchronized (this) {
                if (number > max) {
                    notifyAll();
                    break;
                }

                if (t != threadNumber) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        break;
                    }
                } else {
                    System.out.println(Thread.currentThread().getName() + ": " + number++);
                    t = (t % 3) + 1;
                    notifyAll();
                }

            }
        }

    }
}
