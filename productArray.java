/*
Given an array of n integers where n > 1, nums, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].
*/

public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int res1[]=new int[nums.length];
        int res2[]=new int[nums.length];
        int result[]=new int[nums.length];
        
        res1[0]=1;
        res2[nums.length-1]=1;
        
        for(int i=1;i<nums.length;i++)
        {
            res1[i]=nums[i-1]*res1[i-1];
        }
        
        for(int i=nums.length-2;i>=0;i--)
        {
            res2[i]=nums[i+1]*res2[i+1];
        }
        
        for(int i=0;i<nums.length;i++)
        {
            result[i]=res1[i]*res2[i];
        }
        return result;
    }
}