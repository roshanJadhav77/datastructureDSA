package com.datastructure.datastructureDSA.trickyOutput;

import java.util.Arrays;

//Input: arr[] = {1, 2, 3, 4, 5, 6}, d = 2
// Output: {3, 4, 5, 6, 1, 2}
public class Program7 {
    public static void main(String[] args) {

         int[] arr = {1, 2, 3, 4, 5, 6};
         int d = 2;
         rotationLeft(arr, d);
         System.out.println("Rotation "+ Arrays.toString(arr) );

    }

    private static void rotationLeft(int[] arr, int d) {
        int n = arr.length;
        d = d % n ;

        //1st element
        reverse(arr, 0, d-1);

        //rest arr
        reverse(arr,d,n-1 );

        //entire array
        reverse(arr,0, n-1);

    }

    private static void reverse(int[] arr, int start, int end){
        while(start < end ){
            int temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
    }
}
