package com.practice;

import java.util.HashMap;

public class Day7_Counting_Element {
    public int countElements(int[] arr) {
        int count = 0;
        HashMap<Integer, Integer> distinctElements = new HashMap<>();
        for (int value : arr) {
            if (!distinctElements.containsKey(value)) {
                distinctElements.put(value, value);
            }
        }
        for (int value : arr) {
            if (distinctElements.containsKey(value + 1)) {
                count++;
            }
        }
        return count;
    }
}
