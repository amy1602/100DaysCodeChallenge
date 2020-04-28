package com.practice;

public class Day25_Longest_Common_Subsequence {
    public static int longestCommonSubsequence(String text1, String text2) {
        char[] t1 = text1.toCharArray(), t2 = text2.toCharArray();
        int[] dp = new int[t2.length+1];
        for(int i = 1; i <= t1.length; i++) {
            int prev = 0;
            for(int j = 1; j <= t2.length; j++) {
                int tmp = dp[j];
                if(t1[i-1] == t2[j-1]) dp[j] = prev + 1;
                else dp[j] = Math.max(dp[j], dp[j-1]);
                prev = tmp;
            }
        }
        return dp[t2.length];
    }
}
