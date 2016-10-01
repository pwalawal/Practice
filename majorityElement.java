/*
Majority Element
Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
*/

public class Solution {
    public int majorityElement(int[] nums) {
        
        HashMap<Integer,Integer>hm=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(hm.containsKey(nums[i]))
            {
                hm.put(nums[i],hm.get(nums[i])+1);
                
            }
            else
            {
                hm.put(nums[i],1);
            }
        }
        
        int max=Collections.max(hm.values());
        for(Map.Entry<Integer,Integer> entry:hm.entrySet())
        {
            if(entry.getValue()==max)
            {
                return entry.getKey();
            }
        }
        
        return 0;
        
    }
}