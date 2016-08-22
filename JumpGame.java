/*
Given an array of non-negative integers, you are initially positioned at the first index of the array.

Each element in the array represents your maximum jump length at that position.

Determine if you are able to reach the last index.

*/


public class Solution {
    public boolean canJump(int[] nums) {
        if(nums==null)
        return false;
        
        int jump=0;
        for(int i=0;i<nums.length;i++)
        {
            if(jump<i)
            return false;
            
            jump=Math.max(jump,i+nums[i]);
        }
        return true;
        
    }
}