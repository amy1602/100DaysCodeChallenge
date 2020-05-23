package com.practice.MayChallenge;

import java.util.ArrayList;
import java.util.List;

public class IntervalListIntersection {
    public static int[][] intervalIntersection(int[][] A, int[][] B) {
        if (A.length == 0 || B.length == 0) return new int[0][0];
        List<int[]> tempResult = new ArrayList<>();
        int i = 0, j = 0;
        int currentRightA;
        int currentLeftB;
        int currentLeftA;
        int currentRightB;
        while (i < A.length && j < B.length) {
            currentRightA = A[i][1];
            currentLeftA = A[i][0];
            currentLeftB = B[j][0];
            currentRightB = B[j][1];

            if (currentRightA < currentLeftB) {
                i++;
            } else if (currentLeftA <= currentRightB) {
                tempResult.add(new int[]{Math.max(A[i][0], B[j][0]), Math.min(A[i][1], B[j][1])});
                if (currentRightA <= currentRightB) {
                    i++;
                }
                if (currentRightB <= currentRightA) {
                    j++;
                }
            }
            if (currentRightB < currentLeftA) {
                j++;
            }
        }
        return tempResult.toArray(new int[tempResult.size()][2]);
    }
}
