package com.datastructure.datastructureDSA.java.suvarna.arrays;

public class MultiDimensional {
    public static void main(String[] args){
        int arr[][]=new int[2][3];
        arr[0][0]=4;
        arr[0][1]=46;
        arr[0][2]=33;
        arr[1][0]=9;
        arr[1][1]=36;
        arr[1][2]=99;

        for (int[] i:arr){
            for (int j:i){
                System.out.print(j+ " ");

            }
            System.out.println( );
        }


    }
}
