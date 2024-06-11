package com.datastructure.datastructureDSA.java.interview.coforge;

public class SumOfSubArray {
    public static void main(String[] args) {
        int[] arr = {3,4,-7,1,3,3,1,-4};
        int sum = 7;
        findSubarrays(arr, sum);
    }

    private static void findSubarrays(int[] arr, int sum) {

        for(int i = 0; i < arr.length; i++) {
            int sum_of = 0;
            for(int j = i; j < arr.length; j++) {
                sum_of += arr[j];

                if(sum_of == sum){
                    System.out.println(i+" ,"+j);
                }
            }
        }
    }
}
