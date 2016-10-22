
//Given a 2D binary matrix filled with 0's and 1's, find the largest square containing only 1's and return its area.

public class Solution {
    public int maximalSquare(char[][] matrix) {
        
        if(matrix==null||matrix.length==0||matrix[0].length==0)
        {
            return 0;
        }
        int m=matrix.length;
        int n=matrix[0].length;
        int len=0;
        int[][] dp=new int[m][n]; 
        for(int i=0;i<m;i++)
        {
            if(matrix[i][0]=='1')
            {
                dp[i][0]=1;
                len=1;
            }
        }
        for(int j=0;j<n;j++)
        {
            if(matrix[0][j]=='1')
            {
                dp[0][j]=1;
                len=1;
            }
        }
        
        
        for(int i=1;i<m;i++)
        {
            for(int j=1;j<n;j++)
            {
                if(matrix[i][j]=='0')
                {
                    dp[i][j]=0;
                }
                else if(matrix[i][j]=='1')
                {
                    dp[i][j]=Math.min(Math.min(dp[i-1][j],dp[i][j-1]),dp[i-1][j-1])+1;
                    len=Math.max(len,dp[i][j]);
                }
            }
        }
        return len*len;
        
    }
}