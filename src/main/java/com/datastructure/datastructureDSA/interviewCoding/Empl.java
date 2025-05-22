package com.datastructure.datastructureDSA.interviewCoding;

public class Empl {

   //input [2,3,-2,4]
    //out max subaaray 6;

    public static void main(String[] args) {
        int[] nums = {5,1,-2,4};

        int numbsSofar = nums[0];
        int maxEnding = nums [0];

        for(int i= 1; i< nums.length; i++){
            maxEnding = Math.max(nums[i], maxEnding * nums[i]);
            numbsSofar = Math.max(numbsSofar, maxEnding);
        }

        System.out.println("Maximum subarray: "+numbsSofar);

    }

}
