/*
Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].
*/

public class Solution {
    public void moveZeroes(int[] nums) {
        
        
        int j=0;
        int len=nums.length;
        for(int i=0;i<len;i++)
        {
            if(nums[i]!=0)
            {
                nums[j]=nums[i];
                j++;
            }
        
        }
        
        
        while(j<len)
        {
            nums[j]=0;
            j++;
        }
    }
}