package com.datastructure.datastructureDSA.java.basic;

public class DemoProgram {
    public static void main(String[] args) {
        int[] a = {-3, 4, 5, 6, 9, 7};
        largestSmallest(a);
    }

    static void largestSmallest(int[] array){

        int largest = 0;
        int smallest = 0;

        for(int num : array){
            if(num > largest)
                largest = num;

            if(num < smallest)
                smallest = num;
        }

        System.out.println("Largest numner is : "+largest);
        System.out.println("Smallest numner is : "+smallest);
    }
}




