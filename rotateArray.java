/*
Rotate an array of n elements to the right by k steps.

For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
*/

public class Solution {
    public void rotate(int[] nums, int k) {
        
        if(k>nums.length)
        {
            k=k%nums.length;
        }
        
        int temp[]=new int[nums.length];
        int count=0;
        for(int i=0;i<k;i++)
        {
            temp[i]=nums[nums.length-k+i];
        }
        
   
        for(int i=k;i<nums.length;i++)
        {
            temp[i]=nums[count++];
        }
        
        System.arraycopy( temp, 0, nums, 0, nums.length );
        
        
    }
}