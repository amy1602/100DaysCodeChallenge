package com.practice;

import java.util.List;

public class Day21_Submission_Detail {
    public static int leftMostColumnWithOne(BinaryMatrix binaryMatrix) {
        int n = binaryMatrix.dimensions().get(0);
        int m = binaryMatrix.dimensions().get(1);
        int minIndex = m;
        for (int i = 0; i < n; i++) {
            int foundIndex = searchRow(binaryMatrix, i, 0, m - 1);
            if (foundIndex != -1 && foundIndex < minIndex) {
                minIndex = foundIndex;
            }
        }
        if (minIndex != m)
            return minIndex;
        return -1;
    }

    public static int searchRow(BinaryMatrix binaryMatrix, int row, int start, int end) {
        int mid = (end + start) / 2;
        if (binaryMatrix.get(row, mid) == 1) {
            if (mid == start) return mid;
            return searchRow(binaryMatrix, row, start, mid);
        }
        if (start == end) return -1;
        return searchRow(binaryMatrix, row, mid + 1, end);
    }

    interface BinaryMatrix {
        int get(int x, int y);
        List<Integer> dimensions();
    }
}
