package com.practice;

public class Day15_Product_Of_Array_Except_Self {
    public static int[] productExceptSelf(int[] nums) {
        int [] result = new int[nums.length];
        result[0] = 1;
        if (nums.length == 1) return result;
        for (int  i = 1 ; i < nums.length; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }
        int rightValue = 1;
        for (int i = nums.length - 1; i >= 0; i--){
            result[i] = result[i] * rightValue;
            rightValue *= nums[i];
        }
        return result;
    }
}
