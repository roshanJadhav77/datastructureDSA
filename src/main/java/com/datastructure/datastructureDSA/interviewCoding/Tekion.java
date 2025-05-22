package com.datastructure.datastructureDSA.interviewCoding;

public class Tekion {

    // state - houses 1,2,3 and each house no of point.
    // if i am targing n cant target neigther
    // test cases : house no 1: 10 coins. house no 2. 20 coins. house no 3. 9 coins.
    //  condition : n-1 and n+1

    // 1. coins as houses
    // 2. condition based
    // destination point

    public static void main(String[] args) {
        int[] coins = {10, 20, 9,11,2,1,40};
        int maxCoin = rob(coins);
        System.out.println("Maximum "+ maxCoin);
    }


    private static int rob(int[] coins) {
        int n = coins.length;
        if(n == 0 ) return  0;
        if(n == 1) return coins[0];
        if(n == 2) return  Math.max(coins[0], coins[1]);

//        int[] dp = new int[n];
//        dp[0] = coins[0]; // 10
//        dp[1] = Math.max(coins[0], coins[1]); //20


        int prev2 = 0; //i -2
        int prev1 = coins[0]; //dp[i-1]


        for(int i = 1; i < n; i ++){
         //   dp[i] = Math.max(dp[i - 1], dp[i - 2] + coins[i]);
            int current = Math.max(prev1, prev2 + coins[i]);
            prev2 = prev1;
            prev1 = current;
        }

        return  prev1;

    }
}
