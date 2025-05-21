package com.datastructure.datastructureDSA.interviewToday;

import java.util.Arrays;

public class Paytm2 {
    // [1,0,2]
    // 3 childrens

    public static void main(String[] args) {
       //int[] ratings = {1,0,2};
        int[] ratings = {7,6,4,3,2,1};
        System.out.println("Candies :"+minCandies(ratings));


    }

    public static int minCandies(int[] ratings){
        int n = ratings.length;
        int[] candies = new int[n];

        Arrays.fill(candies, 1);

        //Left - RIght
        for(int i = 1; i < n; i++){
            if(ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }

        //Right to left
        for(int i = n -2; i >= 0; i--){
            if(ratings[i] > ratings[i + 1]) {
                Math.max(candies[i],candies[i] = candies[i + 1] + 1);
            }
        }



        //calculate
        int totalCan = 0;
        for(int candy : candies){
            totalCan += candy;
            System.out.println();
        }

        for(int print : candies){
            System.out.println("canndies here :"+print);
        }

        return totalCan;
    }


}
