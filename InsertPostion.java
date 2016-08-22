/*
Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.
*/

public class Solution {
    public int searchInsert(int[] nums, int target) {
        
        if(nums==null)
        return 0;
        
        int i=0;
        int j=nums.length-1;
        while(i<=j)
        {
            int mid=(i+j)/2;
            if(target<nums[mid])
            {
                j=mid-1;
                
            }
            else if(target> nums[mid])
            {
                i=mid+1;
            
            }
            else
            return mid;
            
        }
        return i;
    }
}