package com.datastructure.datastructureDSA.interviewCoding;

import java.util.Random;
import java.util.Scanner;

public class LoveMatchCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Bride name: ");
        String bride = sc.nextLine();

        System.out.println("Enter Groom name: ");
        String groom = sc.nextLine();

        if(bride.isEmpty() || groom.isEmpty()){
            System.out.println("Names cannot be empty! Please enter valid names.");
        } else {
            int lovePercentage = calculateLovePercentage(bride, groom);
            System.out.println("Love Match Percentage between " + bride + " and " + groom + " is: " + lovePercentage + "%");
        }

    }

    private static int calculateLovePercentage(String bride, String groom) {
        String combination = bride.toLowerCase() + groom.toLowerCase();
        int score = 0;

        for (char entry : combination.toCharArray()){
            score += (int)entry;
        }

        Random random = new Random(score);
        return  50 + random.nextInt(51);
    }
}
