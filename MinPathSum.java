/*
Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right which minimizes the sum of all numbers along its path.
*/

public class Solution {
    public int minPathSum(int[][] grid) {
        
        int m=grid.length;
        int n=grid[0].length;
        int i,j;
        
        int result[][]=new int[m][n];
        result[0][0]=grid[0][0];
        
        //intiliazing top row and column
        for(i=1;i<n;i++)
        {
            result[0][i]=result[0][i-1]+grid[0][i];
        }
        for(j=1;j<m;j++)
        {
            result[j][0]=result[j-1][0]+grid[j][0];
        }
        
        
        //filling up rest of result table
        for(i=1;i<m;i++)
        {
            for(j=1;j<n;j++)
            {
                result[i][j]=Math.min(result[i-1][j],result[i][j-1])+grid[i][j];
            }
        }
        return result[m-1][n-1];
        
        
    }
}