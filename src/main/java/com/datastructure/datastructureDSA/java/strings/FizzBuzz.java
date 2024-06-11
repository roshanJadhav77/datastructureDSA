package com.datastructure.datastructureDSA.java.strings;

public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 0; i <=50; i++){
            if(i%15 == 0)
                System.out.print("FizzBuzz");
             else if(i%5 == 0)
                System.out.print("Fizz");
            else if(i%3 == 0)
                System.out.print("Buzz");
             else
                System.out.print(i+" ");
        }
    }
}
