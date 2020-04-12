package com.practice;

public class Day3_Maximum_Subarray {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) return Integer.MIN_VALUE;
        int maxSubArray = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > maxSubArray) {
                maxSubArray = nums[i];
            }
            if (i < nums.length - 1) {
                int sum = nums[i];
                for (int j = i + 1; j < nums.length; j++) {
                    sum += nums[j];
                    if (sum > maxSubArray) {
                        maxSubArray = sum;
                    }
                }
            }
        }
        return maxSubArray;
    }
}
