class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        
        int dp[]=new int[366];
        
        boolean []dayIncluded=new boolean[666];
        
        for(int day:days){
            dayIncluded[day]=true;
        }
        
        dp[0]=0;
        for(int i=1;i<=365;i++){
            if(dayIncluded[i]==false){
                dp[i]=dp[i-1];
            }else{
                int min=dp[i-1]+costs[0];
                min=Math.min(min, costs[1]+ (i < 7 ? 0 : dp[i-7]));
                min=Math.min(min, costs[2]+ (i < 30 ? 0 : dp[i-30]));
                dp[i]=min;
            }
        }
        return dp[365];
    }
}
