package com.practice;

public class Day26_Maximal_Square {
    public static int maximalSquare(char[][] matrix) {
        if (matrix.length == 0) return 0;
        int numberOfRow = matrix.length;
        int numberOfColumn = matrix[0].length;
        int [][] DP = new int[numberOfRow + 1][numberOfColumn + 1];
        int result = 0;
        for (int i = 1 ; i <= numberOfRow; i++){
            for (int j = 1 ; j <= numberOfColumn; j++) {
                if (matrix[i-1][j -1] == '1'){
                    DP[i][j] = Math.min(Math.min(DP[i-1][j], DP[i][j-1]), DP[i-1][j-1]) + 1;
                    result = Math.max(result, DP[i][j]);
                }
            }
        }
        return result * result;
    }
}
