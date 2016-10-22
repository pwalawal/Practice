/*
Contains Duplicate 2
Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the difference between i and j is at most k.


*/


public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(hm.containsKey(nums[i]))
            {
                int init=hm.get(nums[i]);
                if(k>=i-init)
                {
                    return true;
                }
            }
            
            hm.put(nums[i],i);
            
        }
        
        return false;
        
        
    }
}