package com.datastructure.datastructureDSA.interviewToday;

public class FindLargestTwo {
    public static void main(String[] args) {
        int[] array = {2,4,3,5,6,7,8,6,9};
        findLargetOfTwo(array);
    }

    private static void findLargetOfTwo(int[] array) {
        int maxOne = 0, maxTwo = 0;
        for(int number : array){
            if(maxOne < number){
                maxTwo = maxOne;
                maxOne = number;
            } else if(maxTwo < number){
                maxTwo = number;
            }
        }

        System.out.println("1st Max number is :"+maxOne);
        System.out.println("2st Max number is :"+maxTwo);
    }
    //1st Max number is :9
    //2st Max number is :8
}
