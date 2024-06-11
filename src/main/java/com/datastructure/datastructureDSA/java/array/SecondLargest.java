package com.datastructure.datastructureDSA.java.array;

public class SecondLargest {
    public static void main(String[] args) {
        int[] a = {7,2,4,4,3,5,6,1};
        int len = a.length;
        System.out.println(largestArray(a, len));
    }

    private static int largestArray(int[] array, int len) {
        int temp;
        for(int i = 0; i < len; i++) {
            for(int j = i +1; j < len ; j++) {
                if(array[i] > array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array[len - 2];
    }
}
