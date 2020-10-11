class Solution {
    public int minCost(int[][] costs) {
        
        if(costs.length==0 || costs[0].length==0)return 0;
        
        int [][]dp=new int[costs.length][3];
        int n=costs.length;
        for(int j=0;j<3;j++){
            dp[0][j]=costs[0][j];
            //initialize dp
        }
        
        for(int i=1;i<n;i++){
            dp[i][0]=Math.min(dp[i-1][1],dp[i-1][2])+costs[i][0];
            dp[i][1]=Math.min(dp[i-1][0],dp[i-1][2])+costs[i][1];
            dp[i][2]=Math.min(dp[i-1][1],dp[i-1][0])+costs[i][2];
        }
        
        return Math.min(dp[n-1][0],Math.min(dp[n-1][1],dp[n-1][2]));
        
    }
}
