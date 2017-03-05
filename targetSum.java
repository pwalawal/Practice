//Target Sum

public class Solution {
    
    int result=0;
    public int findTargetSumWays(int[] nums, int S) {
        if(nums==null||nums.length==0){
            return result;
        }
        
        dfs(nums,S,0,0);
        return result;
    }
    
    public void dfs(int[] nums, int S,int i, long sum){
        if(i==nums.length){
            if(S==sum){
                result++;
            }
            return;
        }
        
        dfs(nums,S,i+1,sum+nums[i]);
        dfs(nums,S,i+1,sum-nums[i]);
    }
}