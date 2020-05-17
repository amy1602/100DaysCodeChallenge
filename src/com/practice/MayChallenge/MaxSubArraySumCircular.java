package com.practice.MayChallenge;

public class MaxSubArraySumCircular {
    public int maxSubarraySumCircular(int[] A) {
        int n = A.length;
        int max_kadane = kadane(A);
        if(max_kadane < 0) return max_kadane;
        int max_wrap = 0, i;
        for (i = 0; i < n; i++)
        {
            max_wrap += A[i]; // Calculate array-sum
            A[i] = -A[i]; // invert the array (change sign)
        }
        max_wrap = max_wrap + kadane(A);

        return (max_wrap > max_kadane)? max_wrap: max_kadane;
    }

    static int kadane (int a[])
    {
        int n = a.length;
        int max_so_far = 0, max_ending_here = 0;
        for (int i = 0; i < n; i++)
        {
            max_ending_here = max_ending_here + a[i];
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }
}
