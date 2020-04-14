package com.practice;

public class Day14_Perform_String_Shift {
    public static String stringShift(String s, int[][] shift) {
        if (shift == null || shift.length == 0) return s;
        int totalShiftLeft = 0;
        for (int[] ints : shift) {
            if (ints[0] == 0) {
                totalShiftLeft += ints[1];
            } else {
                totalShiftLeft -= ints[1];
            }
        }
        if (Math.abs(totalShiftLeft) >= s.length()) {
            totalShiftLeft = totalShiftLeft % s.length();
        }
        totalShiftLeft = totalShiftLeft % s.length();
        if (totalShiftLeft > 0) {
            String movedString = s.substring(0, totalShiftLeft);
            return s.substring(totalShiftLeft) + movedString;
        } else if (totalShiftLeft < 0) {
            totalShiftLeft = -totalShiftLeft;
            String movedString = s.substring(s.length() - totalShiftLeft);
            return movedString + s.substring(0, s.length() - totalShiftLeft);
        }
        return s;
    }
}
