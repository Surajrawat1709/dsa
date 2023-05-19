package com.graph.leetcode;

public class NumberOfIslands {
    public static void main(String[] args) {
       int[][] grid = {{1,1,1,1,0},
  {1,1,0,1,0},
  {1,1,0,0,0},
  {0,0,0,0,0}};

        System.out.println(numIslands(grid));
    }
    public static int numIslands(int[][] grid) {
int len1=grid.length;
int len2=grid[0].length;
int count=0;

for(int i=0;i<len1;i++){
    for(int j=0;j<len2;j++){
        if (grid[i][j]==1) {
            count++;

            dfs(grid,i,j);

        }
    }
}
return count;
    }

    private static void dfs(int[][] grid, int row, int col) {
        if(row<0||col<0||row>=grid.length||col>=grid[0].length||grid[row][col]==0)
            return;

        grid[row][col]=0;

        dfs(grid,row-1,col);
        dfs(grid,row,col-1);
        dfs(grid,row+1,col);
        dfs(grid,row,col+1);


    }
}
