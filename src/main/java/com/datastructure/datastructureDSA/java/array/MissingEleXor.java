package com.datastructure.datastructureDSA.java.array;

public class MissingEleXor {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,6};

        int xor1 = a[0];
        for (int i = 1; i < a.length; i++) {
            xor1 = xor1 ^ a[i];
        }

        int xor2 = 1;
        for (int i = 2; i <= (a.length+1); i++) {
            xor2 = xor2 ^ i;
        }

        int result = xor1 ^ xor2;
        System.out.println("Missing element is: "+result);
    }
}
