package com.practice;

public class Day17_Number_of_Islands {
    public int numIslands(char[][] grid) {
        if (grid.length == 0) return 0;
        int [][] gridBelongToIsland = new int[grid.length][grid[0].length];
        int islandCount = 0;
        for (int i = 0 ; i < grid.length; i++){
            for (int j = 0 ; j < grid[i].length; j++) {
                if (grid[i][j] == '1' && gridBelongToIsland[i][j] == 0) {
                    islandCount ++;
                    gridBelongToIsland[i][j] = islandCount;
                    travelGrid(grid, gridBelongToIsland, i, j, grid.length, grid[0].length);
                }
            }
        }
        return islandCount;
    }
    
    public static void travelGrid(char[][] grid, int [][]gridBelongToIsland, int i, int j, int nR, int nC) {
        if (j > 0 && grid[i][j - 1] == '1' && gridBelongToIsland[i][j-1] == 0) {
            gridBelongToIsland[i][j-1] = gridBelongToIsland[i][j];
            travelGrid(grid, gridBelongToIsland, i, j - 1, nR, nC);
        }
        if (j < nC - 1 && grid[i][j + 1] == '1' && gridBelongToIsland[i][j + 1] == 0) {
            gridBelongToIsland[i][j + 1] = gridBelongToIsland[i][j];
            travelGrid(grid, gridBelongToIsland, i, j + 1, nR, nC);
        }
        if (i > 0 && grid[i - 1][j] == '1' && gridBelongToIsland[i - 1][j] == 0) {
            gridBelongToIsland[i-1][j] = gridBelongToIsland[i][j];
            travelGrid(grid, gridBelongToIsland, i - 1, j, nR, nC);
        }
        if (i < nR - 1 && grid[i + 1][j] == '1' && gridBelongToIsland[i + 1][j] == 0) {
            gridBelongToIsland[i + 1][j] = gridBelongToIsland[i][j];
            travelGrid(grid, gridBelongToIsland, i + 1, j, nR, nC);
        }
    }
}
