/*Given an array of integers, return indices of the two numbers such that they add up to a specific target.You may assume that each input would have exactly one solution.*/




public class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        int len=nums.length;
        int result[]=new int[2];
        for(int i=0;i<len;i++)
        {
            if(hm.containsKey(nums[i]))
            {
                
                result[0]=hm.get(nums[i]);
                result[1]=i;
                break;
            }
            else
            hm.put(target-nums[i],i);
        
        }
        return result;
        
    }
}