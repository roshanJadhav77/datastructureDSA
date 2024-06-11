package com.datastructure.datastructureDSA.java.number;

public class Largest {
    public static void main(String[] args) {
        int x=10, y=20, z=30;

        if(x>y && x>z){
            System.out.println("Largest "+x);
        } else if(y>z){
            System.out.println("Largest "+y);
        } else {
            System.out.println("Largest "+z);
        }
    }
}
