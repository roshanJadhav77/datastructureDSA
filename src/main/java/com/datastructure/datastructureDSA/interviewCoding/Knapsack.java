package com.datastructure.datastructureDSA.interviewCoding;


// w[] = {3, 4, 5}
// val[] = {30,50, 60}
// C = 8
public class Knapsack {

    public static void main(String[] args) {

        int[] weight = {3,3, 4, 5};
        int[] value = {30,20, 50, 60};
        int capacity = 8;

        int knapsack = knapsack(weight, value, capacity);
        System.out.println("Value : "+knapsack);

    }

    public static int knapsack(int[] weight, int[] value, int capacity){
        int length = weight.length;

        int[][] dp =new int[length + 1][capacity +1];

        for(int i=1; i <=length; i++){
            for(int j=1; j <= capacity; j++){
                if(weight[i -1] <= j ){
                    dp[i][j] = Math.max(dp[i -1][j], dp[i -1][j - weight[i -1]]+ value[i -1]);
                } else {
                    dp[i][j] = dp[i -1][j];
                }

            }

        }

        return dp[length][capacity];

    }
}
