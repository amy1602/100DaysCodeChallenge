package com.practice;

import java.util.ArrayList;
import java.util.List;

public class Day2_Happy_Number {
    public boolean isHappy(int n) {
        List<Integer> checkedResults = new ArrayList<>();
        checkedResults.add(n);
        while (true) {
            if (n == 1) {
                return true;
            }
            int temp = n;
            n = 0;
            while (temp != 0) {
                n += Math.pow(temp % 10, 2);
                temp = temp / 10;
            }
            if (checkedResults.contains(n)) {
                return false;
            } else {
                checkedResults.add(n);
            }
        }
    }
}
