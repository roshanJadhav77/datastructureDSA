package com.datastructure.datastructureDSA.java.array;

public class FindLargestTwo {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        findLargestTwo(a);
    }

    static void findLargestTwo(int[] array) {
        int maxOne = 0;
        int maxTwo = 0;
        // int maxThird = 0;
        for (int number : array) {
            if (maxOne < number) {
                maxTwo = maxOne;
                maxOne = number;
            } else if (maxTwo < number) {
                maxTwo = number;
            }
        }
        System.out.println("1st largest: " + maxOne);
        System.out.println("2st largest: " + maxTwo);

    }
}


