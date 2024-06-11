package com.datastructure.datastructureDSA.java.array;

public class FindTwoLargest {
    public static void main(String[] args) {

        int[] a = {1,2,3,4,5};
        findTwoMaxNumber(a);

    }

    public static void findTwoMaxNumber(int[] array){
        int maxOne = 0;
        int maxTwo = 0;

        for(int num : array){
            if(maxOne < num){
                maxTwo = maxOne;
                maxOne = num;
            } else if(maxTwo < num){
                maxTwo = num;
            }
        }

        System.out.println("1st largest number is "+maxOne);
        System.out.println("2st largest number is "+maxTwo);
    }
}
