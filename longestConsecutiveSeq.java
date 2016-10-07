/*
Longest Consecutive Sequence
Given an unsorted array of integers, find the length of the longest consecutive elements sequence.

*/

public class Solution {
    public int longestConsecutive(int[] nums) {
        
        int result=1;
        int count=1,low,high;
        
        HashSet<Integer> hs=new HashSet<Integer>();
        for(int num:nums)
        {
            hs.add(num);
        }
        
        for(int num:nums)
        {
            low=num-1;
            high=num+1;
            count=1;
            
            while(hs.contains(low)){
                hs.remove(low);
                count++;
                low--;
            }
            
            while(hs.contains(high)){
                hs.remove(high);
                count++;
                high++;
                
            }
            result=Math.max(result,count);   
        }
        
        
        return result;
        
        
    }
}