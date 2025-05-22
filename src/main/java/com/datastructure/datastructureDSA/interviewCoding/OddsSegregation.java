package com.datastructure.datastructureDSA.interviewCoding;

import java.util.Arrays;

public class OddsSegregation {
  //  {0,2,4,0,0,1,0}

    public static void main(String[] args) {
        int[] arr = {0,2,4,0,0,1,0};
        segregation(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void segregation(int[] arr){
        int length = arr.length;
        int j = length - 1;

        for(int i = length-1; i >= 0; i-- ){
            if(arr[i] != 0){
                arr[j] = arr[i];
                j--;
            }
        }

        while(j>= 0){
            arr[j] = 0;
            j--;
        }

    }
    //2 map
}
