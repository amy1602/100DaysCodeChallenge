package com.practice;

import java.util.HashMap;

public class Day13_Contiguous_Array {
    public static int findMaxLength(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        // Creates an empty hashMap hM

        HashMap<Integer, Integer> hM = new HashMap<>();

        int sum = 0;     // Initialize sum of elements
        int max_len = 0; // Initialize result
        int ending_index = -1;
        int start_index = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++)
        {
            nums[i] = (nums[i] == 0) ? -1 : 1;
        }

        // Traverse through the given array

        for (int i = 0; i < n; i++)
        {
            // Add current element to sum

            sum += nums[i];

            // To handle sum=0 at last index

            if (sum == 0)
            {
                max_len = i + 1;
                ending_index = i;
            }

            // If this sum is seen before, then update max_len
            // if required

            if (hM.containsKey(sum + n))
            {
                if (max_len < i - hM.get(sum + n))
                {
                    max_len = i - hM.get(sum + n);
                    ending_index = i;
                }
            }
            else // Else put this sum in hash table
                hM.put(sum + n, i);
        }

        for (int i = 0; i < n; i++)
        {
            nums[i] = (nums[i] == -1) ? 0 : 1;
        }

        int end = ending_index - max_len + 1;
        System.out.println(end + " to " + ending_index);

        return max_len;
    }
}
