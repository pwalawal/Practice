//Given a sorted integer array without duplicates, return the summary of its ranges for consecutive numbers.

public class Solution {
    public List<String> summaryRanges(int[] nums) {
        
        List<String> result=new LinkedList<>();
        if(nums.length<1)
        {
            return result;
        }
         if(nums.length==1)
        {
            result.add(String.valueOf(nums[0]));
            return result;
        }
        
        
        int start=nums[0];
        int range=0;
        
        for(int i=1;i<=nums.length;i++)
        {
            if(i!=nums.length && nums[i]==nums[i-1]+1)
            {
                range++;
            }
            else
            {
                if(range==0)
                {
                    result.add(String.valueOf(start));
                }
                else
                {
                    result.add(String.valueOf(start)+"->"+String.valueOf(start+range));
                }
                if(i!=nums.length)
                {
                    start=nums[i];
                    range=0;
                    
                }
                
                
            }
        }
        return result;
    }
}