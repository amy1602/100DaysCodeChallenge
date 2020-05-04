package com.practice.MayChallenge;

public class Day4_Number_Complement {
    public static int findComplement(int num) {
        int bitCount = 0;
        int temp = num;
        while (temp > 0) {
            bitCount ++;
            temp /= 2;
        }
        return (int) (Math.pow(2, bitCount) - 1 - num);
    }
}
