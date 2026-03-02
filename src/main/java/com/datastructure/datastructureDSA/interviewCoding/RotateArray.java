package com.datastructure.datastructureDSA.interviewCoding;

// Example: [1,2,3,4] If k = 1,
//output = [4,1,2,3] If k = 2, output = [3,4,1,2]]
public class RotateArray {
    public static void main(String[] args) {

        int[] arr =  {1,2,3,4};
        int k =1;

        rotation(arr, k);

        for(int x: arr){
            System.out.print(x+ " ");
        }

    }

    public static void rotation(int[] arr, int k){
        int length = arr.length;
        k = k % length ;

        reverse(arr, 0, length - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, length - 1);

    }

    public static void reverse(int[] nums, int left, int right ){
        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }
}
