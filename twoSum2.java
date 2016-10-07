/*
Two Sum II - Input array is sorted  
Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.


*/


public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        if(numbers==null||numbers.length==0)
        {
            return null;
        }
        
        int i=0;
        int j=numbers.length-1;
        int result[]=new int[2];
        
        while(i<j)
        {
            int sum=numbers[i]+numbers[j];
            if(sum==target)
            {
                result[0]=i+1;
                result[1]=j+1;
                return result;
            }
            else if(sum<target)
            {
                i++;
            }
            else
            {
                j--;
            }
        }
        return null;
        
    }
}