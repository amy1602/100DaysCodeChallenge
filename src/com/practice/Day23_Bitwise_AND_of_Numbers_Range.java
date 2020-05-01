package com.practice;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Day23_Bitwise_AND_of_Numbers_Range {
    LinkedHashMap<Integer, Integer> list = new LinkedHashMap<>();
    public static int rangeBitwiseAnd(int m, int n) {
        while (n > m) {
            n = n & n - 1;
        }
        return m & n;
    }
}
