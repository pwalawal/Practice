//Given a non-negative integer n, count all numbers with unique digits, x, where 0 ≤ x < 10n.

public class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if(n==0)
        {
            return 1;
        }
        int dp[] = new int[n + 1];
        dp[0] = 1;
        dp[1] = 9;
        int result=dp[0]+dp[1];
       
        int m=9;
        
        for(int i=2;i<=n && m>0;i++)
        {
            dp[i]=dp[i-1]*m--;
            result+=dp[i];
        }
        return result;
        
    }
}