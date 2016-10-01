/*
 Maximum Product Subarray
Find the contiguous subarray within an array (containing at least one number) which has the largest product.
*/

public class Solution {
    public int maxProduct(int[] nums) {
        
        
        if(nums.length==1)
        {
            return nums[0];
        }
        
        int max=nums[0];
        int min=nums[0];
        int result=nums[0];
        for(int i=1;i<nums.length;i++)
        {
         int curMax=max;
         int curMin=min;
         max=Math.max(Math.max(curMax*nums[i],curMin*nums[i]),nums[i]);
         min=Math.min(Math.min(curMax*nums[i],curMin*nums[i]),nums[i]);
         result=Math.max(result,max);
        }
        
        return result;
        
        
    }
}