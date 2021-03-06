/*
Follow up for "Remove Duplicates":
What if duplicates are allowed at most twice?

For example,
Given sorted array nums = [1,1,1,2,2,3],

Your function should return length = 5, with the first five elements of nums being 1, 1, 2, 2 and 3. It doesn't matter what you leave beyond the new length.
*/

public class Solution {
    public int removeDuplicates(int[] nums) {
        
        int count=0;
        if(nums.length<=2)
        {
            return nums.length;
        }
        
        int prev=1;
        int cur=2;
        
        while(cur<nums.length)
        {
            if(nums[cur]==nums[prev] && nums[prev]==nums[prev-1])
            {
                count++;
                cur++;
            }
            else
            {
                prev++;
                nums[prev]=nums[cur];
                cur++;
            }
            
        }
        return nums.length-count;
        
        
    }
}