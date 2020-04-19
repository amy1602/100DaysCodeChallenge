package com.practice;

public class Day19_Search_In_Rotated_Sorted_Array {
    public static int search(int[] nums, int target) {
        if (nums.length == 0) return -1;
        if (nums.length == 1) return target == nums[0] ? 0 : -1;
        if (nums[0] <= target) {
            int  i = 0;
            while (i < nums.length) {
                if (i > 0 && nums[i] < nums[i - 1]) {
                    return  -1;
                } else if (nums[i] == target) {
                    return i;
                }
                i ++;
            }
        } else if (nums[nums.length - 1] >= target) {
            int i = nums.length - 1;
            while (i >= 0) {
                if (i < nums.length - 1 && nums[i] > nums[i + 1]) {
                    return -1;
                } else if (nums[i] == target) {
                    return i;
                }
                i--;
            }
        }
        return -1;
    }
}
