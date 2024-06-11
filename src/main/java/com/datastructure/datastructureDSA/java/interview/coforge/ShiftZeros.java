package com.datastructure.datastructureDSA.java.interview.coforge;

public class ShiftZeros {
    public static void main(String[] args) {

        int arr[] = {1,0,2,0,3,0,4,0,5,0,0};

        int n = arr.length;

        shiftZeros(arr, n);
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }

    }

    private static void shiftZeros(int[] arr, int n) {

        int count = 0;
        for(int i = 0; i<n; i++){
            if(arr[i] != 0){
                arr[count++]= arr[i];
            }
        }
        while (count < n){
            arr[count++]= 0;
        }
    }
}
