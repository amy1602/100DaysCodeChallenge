package com.practice;

public class Day25_Jump_Game {
    public static boolean canJump(int[] nums) {
        if (nums.length == 1) return true;
        int destination = nums.length - 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] >= destination - i) {
                destination = i;
            }
        }
        return destination == 0;
    }
}
