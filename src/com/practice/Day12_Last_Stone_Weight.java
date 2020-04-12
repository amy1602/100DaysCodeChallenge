package com.practice;

import java.util.Arrays;

public class Day12_Last_Stone_Weight {
    public int lastStoneWeight(int[] stones) {
        if (stones == null || stones.length == 0) return 0;
        if (stones.length == 1) return stones[0];

        Arrays.sort(stones);
        int length = stones.length;
        while (true) {
            if (stones[length - 2] == 0) {
                return stones[length - 1];
            }
            if (Math.abs(stones[length - 1] - stones[length - 2]) == 0) {
                stones[length - 1] = 0;
                stones[length - 2] = 0;
            } else {
                stones[length - 2] = Math.abs(stones[length - 1] - stones[length - 2]);
                stones[length - 1] = 0;
            }
            Arrays.sort(stones);
        }
    }
}
