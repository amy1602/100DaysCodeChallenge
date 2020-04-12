package com.practice;

public class Day1_Single_Number {
    public int singleNumber(int[] nums) {
        int rest = nums[0];
        for (int  i = 1; i < nums.length; i++) {
            rest = rest ^ nums[i];
            System.out.println(rest);
        }
        return rest;
    }
}
