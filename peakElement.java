/*
Find Peak Element
A peak element is an element that is greater than its neighbors.

Given an input array where num[i] ≠ num[i+1], find a peak element and return its index.

The array may contain multiple peaks, in that case return the index to any one of the peaks is fine.

You may imagine that num[-1] = num[n] = -∞.

For example, in array [1, 2, 3, 1], 3 is a peak element and your function should return the index number 2.
*/


public class Solution {
    public int findPeakElement(int[] nums) {
        
        int max=nums[0];
    
        
        for(int i=1;i<=nums.length-2;i++)
        {
            if(nums[i]>nums[i-1] && nums[i]>nums[i+1] && nums[i] > max)
            {
                return i;
            }
        }
        
        if(nums[nums.length-1]>max)
        {
            return nums.length-1;
        }
     
        
        
        return 0;
        
    }
}