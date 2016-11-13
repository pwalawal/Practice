/*Follow up for "Unique Paths":

Now consider if some obstacles are added to the grids. How many unique paths would there be?

An obstacle and empty space is marked as 1 and 0 respectively in the grid.
*/

public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        if(obstacleGrid.length==0 || obstacleGrid[0][0]==1||obstacleGrid[m-1][n-1]==1)
        {
            return 0;
        }
        

        
        int[][] dp=new int[m][n];
        dp[0][0]=1;
        int i=0;
        while(i<m && obstacleGrid[i][0]==0)
        {
            dp[i][0]=1;
            i++;
        }
        int j=0;
        while(j<n && obstacleGrid[0][j]==0)
        {
            dp[0][j]=1;
            j++;
        }
        
        
        for(i=1;i<m;i++)
        {
            for(j=1;j<n;j++)
            {
                if(obstacleGrid[i][j]==1)
                {
                    dp[i][j]=0;
                }
                else
                {
                    dp[i][j]=dp[i-1][j]+dp[i][j-1];
                }
            }
        }
        
        
        return dp[m-1][n-1];
        
    }
    
}