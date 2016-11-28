//You are given coins of different denominations and a total amount of money amount. Write a function to compute the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.

public class Solution {
    public int coinChange(int[] coins, int amount) {
        
        if(amount==0){
            return 0;
        }
        
        int[] dp=new int[amount+1];
        
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;
        
        for(int coin: coins)
        {
            for(int i=coin;i<=amount;i++)
            {
                    if(dp[i-coin]!=Integer.MAX_VALUE){
                        dp[i]=Math.min(dp[i-coin]+1,dp[i]);
                    }
            }
        }
        if(dp[amount]==Integer.MAX_VALUE){
            return -1;
        }
        return dp[amount];
        
        
        
    }
}