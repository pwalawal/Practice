//Find Minimum in Rotated Sorted Array 

public class Solution {
    public int findMin(int[] nums) {
        //can also be solved by BST
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]>nums[i+1])
            {
                return nums[i+1];
            }
            
        }
        
        return nums[0];
        
    }
}