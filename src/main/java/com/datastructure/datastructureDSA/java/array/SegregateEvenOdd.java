package com.datastructure.datastructureDSA.java.array;

import java.util.Arrays;

public class SegregateEvenOdd {

    static void swapOdd(int[] arr, int n){
        int j= -1, temp;

        for (int i=0; i < n; i++){
            if(arr[i] % 2 == 0){
                j++;

                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8,9,10};
        int len = arr.length;

        swapOdd(arr, len);

        System.out.println(Arrays.toString(arr));

        for(int i=0; i < len; i++){
            System.out.print(arr[i]+",");
        }
    }
}
