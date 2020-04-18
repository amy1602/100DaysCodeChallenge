package com.practice;

public class Day18_Minimum_Path_Sum {
    public static int minPathSum(int[][] grid) {
        if (grid.length == 0) return 0;
        int [][] minMatrix = new int[grid.length][grid[0].length];
        return travelPoint(grid, minMatrix, 0, 0, grid.length, grid[0].length);
    }

    public static int travelPoint(int[][] grid, int [][] minMatrix, int i, int j, int maxRow, int maxColumn) {
        if (minMatrix[i][j] != 0) {
            return minMatrix[i][j];
        }
        if (i < maxRow - 1 && j < maxColumn - 1) {
            minMatrix[i][j] = grid[i][j] + Math.min(travelPoint(grid, minMatrix, i + 1, j, maxRow, maxColumn), travelPoint(grid, minMatrix, i, j + 1, maxRow, maxColumn));
            return minMatrix[i][j];
        } else if (i < maxRow - 1) {
            minMatrix[i][j] = grid[i][j] + travelPoint(grid, minMatrix,i + 1, j, maxRow, maxColumn);
            return minMatrix[i][j];
        } else if (j < maxColumn - 1) {
            minMatrix[i][j] = grid[i][j] + travelPoint(grid, minMatrix, i, j + 1, maxRow, maxColumn);
            return minMatrix[i][j];
        }
        minMatrix[i][j] = grid[i][j];
        return minMatrix[i][j];
    }
}
