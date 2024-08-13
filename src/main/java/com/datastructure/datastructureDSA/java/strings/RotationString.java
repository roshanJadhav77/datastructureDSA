package com.datastructure.datastructureDSA.java.strings;

import java.util.Scanner;

public class RotationString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter original String");

        String input = scanner.nextLine(); System.out.println("Please enter rotation of String");
        String rotation = scanner.nextLine();

        if (checkRotatation(input, rotation)) {
            System.out.println(input + " and " + rotation + " are rotation of each other");
        } else {
            System.out.println("Sorry, they are not rotation of another");
        }

        scanner.close();
        

    }


    public static boolean checkRotatation(String original, String rotation) {

        if (original.length() != rotation.length()) {
            return false;
        }

        String concatenated = original + original;
        if (concatenated.indexOf(rotation) != -1) {
            return true;
        }
        return false;
    }

}
