package com.datastructure.datastructureDSA.java.interview.coforge;

import java.lang.reflect.Array;

public class ShiftZero {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        int len = arr.length;

        shiftZeros(arr, len);
        for(int i = 0; i < len; i++) {
            System.out.print(arr[i] + " , ");
        }

    }

    static void shiftZeros(int[] arr, int len){

        int count = 0;
        for(int i=0; i<len; i++){
            if(arr[i] !=0){
                arr[count++] = arr[i];
            }
        }

        while(count < len){
            arr[count++] = 0;
        }
    }
}
