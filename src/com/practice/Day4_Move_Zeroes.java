package com.practice;

public class Day4_Move_Zeroes {
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0 || nums.length == 1) return;
        int foundCount = 0;
        for (int i = 0 ; i < nums.length; i++) {
            if (i >= nums.length - foundCount) {
                nums[i] = 0;
            } else {
                nums[i] = nums[i + foundCount];
                if (nums[i] == 0) {
                    i--;
                    foundCount++;
                }
            }
        }
    }
}
