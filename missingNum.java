/*Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

For example,
Given nums = [0, 1, 3] return 2*/

public class Solution {
    public int missingNumber(int[] nums) {
        
        Arrays.sort(nums);
        int start=0;
        int end=nums.length;int mid;
        while(start<end){
            mid=start+(end-start)/2;
            if(nums[mid]>mid){
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return start;
        
    }
}