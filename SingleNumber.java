//Given an array of integers, every element appears twice except for one. Find that single one.

public class Solution {
    public int singleNumber(int[] nums) {
        
        HashSet<Integer> hs=new HashSet<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(!hs.add(nums[i]))
            {
                hs.remove(nums[i]);
            }
        }
        
        Iterator<Integer> it = hs.iterator();
	return it.next();
        
    }
}