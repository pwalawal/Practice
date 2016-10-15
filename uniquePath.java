
/*
Unique Path
A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).

The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).

How many possible unique paths are there?
*/


public class Solution {
    public int uniquePaths(int m, int n) {
        

        int result[][]=new int[m][n];
        //initializing 1st row as zero
        for(int i=0;i<m;i++)
        {
            result[i][0]=1;
        }
        //initializing 1st column as zero 
        for(int j=0;j<n;j++)
        {
            result[0][j]=1;
        }
        //dynamic programming
        for(int i=1;i<m;i++)
        {
            for(int j=1;j<n;j++)
            {
                result[i][j]=result[i-1][j]+result[i][j-1];
            }
        }
        
        return result[m-1][n-1];
        
        
    }
}