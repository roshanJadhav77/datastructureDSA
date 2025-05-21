package com.datastructure.datastructureDSA.Suvarna.DSA;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 7, 15, 27, 33, 45, 51, 88, 99, 100};
        int target = 45;
        System.out.println(search(arr, target, 0, arr.length-1));

    }
    static int search(int[] arr, int target, int start, int end){
        int mid = start + (end - start);

        if(arr[mid] == target){
            return arr[mid];
        }

        if(target< arr[mid]){
            return search( arr, target, start, mid-1);
        }

            return search(arr, target, mid+1, end);

    }
}
