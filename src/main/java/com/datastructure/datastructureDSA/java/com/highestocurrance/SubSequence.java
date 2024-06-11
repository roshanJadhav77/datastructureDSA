package com.datastructure.datastructureDSA.java.com.highestocurrance;

public class SubSequence {
    public static void main(String[] args) {
        String str = "bbccccbb";
        int m = str.length();

        System.out.println("The sub sequence lenth is "+getSubSeque(str, m, m));

    }

    static int getSubSeque(String str, int n, int m){

        if( n == 0 || m == 0 )
            return 0;

        if(str.charAt(m - 1) == str.charAt(n - 1) && m != n){
            return getSubSeque(str, n-1, m-1) + 1;
        }

        return Integer.max(getSubSeque(str, n, m-1),
                getSubSeque(str, n-1, m));

    }
}
