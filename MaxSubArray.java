//Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

public class Solution {
    public int maxSubArray(int[] nums) {
        
        int max=nums[0];
        int sum=nums[0];
        
        int len=nums.length;
        for(int i=1;i<len;i++)
        {
            sum=Math.max(nums[i],sum+nums[i]);
            max=Math.max(max,sum);
        }
        
        return max;
    }
}