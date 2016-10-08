/*
Minimum Size Subarray Sum
Given an array of n positive integers and a positive integer s, find the minimal length of a subarray of which the sum ≥ s. If there isn't one, return 0 instead.

For example, given the array [2,3,1,2,4,3] and s = 7,
the subarray [4,3] has the minimal length under the problem constraint.

*/


public class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        
       if(nums==null||nums.length==0)
       {
           return 0;
       }
       
       int j=0;
       int result=Integer.MAX_VALUE;
       int sum=0;
       boolean flag=false;
       //two pointers to check which minimum size subarray is equal to or greater than sum
       for(int i=0;i<nums.length;i++)
       {
           while(j<nums.length && sum<s)
           {
               sum=sum+nums[j];
               j++;
           }
           if(sum>=s)
           {
               result=Math.min(result,j-i);
               sum=sum-nums[i];
               flag=true;
            }
       }
        
        if(!flag)
        {
            return 0;
        }
        else
        {
            return result;
        }
        
        
        
        
    }
}