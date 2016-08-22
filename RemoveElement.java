//Given an array and a value, remove all instances of that value in place and return the new length.

public class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0;
        int j=0;
        
        for(j=0;j<nums.length;j++)
        {
            if(nums[j]!=val)
            {
                nums[i]=nums[j];
                i++;
            }
        }
        return i;
    }
}