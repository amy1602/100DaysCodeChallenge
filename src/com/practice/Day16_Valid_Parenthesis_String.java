package com.practice;

import java.util.ArrayList;
import java.util.List;

public class Day16_Valid_Parenthesis_String {
    public static boolean checkValidString(String s) {
        List<Integer> leftItem = new ArrayList<>();
        List<Integer> specificItem = new ArrayList<>();
        for (int i = 0 ; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                leftItem.add(i);
            } else if (s.charAt(i) == '*') {
                specificItem.add(i);
            } else {
                if (leftItem.size() > 0) {
                    leftItem.remove(leftItem.size() - 1);
                } else if (specificItem.size() > 0) {
                    specificItem.remove(specificItem.size() - 1);
                } else {
                    return false;
                }
            }
        }
        if (leftItem.size() > specificItem.size()) {
            return false;
        } else {
            for (int  i = 0 ; i < leftItem.size(); i++){
                if (i < specificItem.size() && specificItem.get(i) > leftItem.get(i)) {
                    leftItem.remove(i);
                    specificItem.remove(i);
                    i--;
                } else if (i < specificItem.size()) {
                    specificItem.remove(i);
                    i--;
                }
            }
            return leftItem.size() <= 0;
        }
    }
}
