/*
Contains duplicate 3
Given an array of integers, find out whether there are two distinct indices i and j in the array such that the difference between nums[i] and nums[j] is at most t and the difference between i and j is at most k.
*/

public class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if(k<0||t<0||nums.length<2)
        {
            return false;
        }
       TreeSet<Integer>ts=new TreeSet<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            int temp=nums[i];
            if(ts.floor(temp)!=null && ts.floor(temp)>=temp-t || ts.ceiling(temp)!=null && ts.ceiling(temp)<=temp+t){
                return true;
            }
            ts.add(temp);
            if(i>=k)
            {
                ts.remove(nums[i-k]);
            }
            
        }
        return false;
    }
}