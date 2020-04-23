package com.practice;

public class Day22_Bitwise_AND_of_Numbers_Range {
    public static int rangeBitwiseAnd(int m, int n) {
        while (n > m) {
            n = n & n - 1;
        }
        return m & n;
    }

    public static int otherSolution(int m, int n) {
        int shift = 0;
        while(m < n){ // when equals 0, stop
            m >>= 1;
            n >>= 1;
            shift++;
        }
        return m << shift;
    }
}
