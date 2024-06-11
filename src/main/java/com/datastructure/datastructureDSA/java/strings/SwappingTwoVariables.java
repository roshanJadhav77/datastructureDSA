package com.datastructure.datastructureDSA.java.strings;

import java.util.Scanner;

public class SwappingTwoVariables {
    public static void main(String[] args) {

        int temp, x, y;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value for X and Y");
        x = scanner.nextInt();
        y = scanner.nextInt();
        System.out.println("Before swapping "+x+" " +y);

        //With 3rd variables
       /* temp = x;
        x = y;
        y = temp;
        System.out.println("After swapping "+x+" " +y);*/

        // without using 3rd variable
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("AAfter swapping "+x+" " +y);
    }
}
