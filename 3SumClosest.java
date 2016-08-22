//Given an array S of n integers, find three integers in S such that the sum is closest to a given number, target. Return the sum of the three integers. You may assume that each input would have exactly one solution.


public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        int result=0;
        
        int min=1000000;int diff;
        if(nums==null||nums.length<3)
        return result;
        
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            
                int j=i+1;
                int k=nums.length-1;
                
                while(j<k)
                {
                   int sum= nums[i]+nums[j]+nums[k];
                   diff=Math.abs(target-sum);
                   if(diff<min)
                   {
                       min=diff;
                       result=sum;
                   }
                    
                       if(sum<=target)
                        
                        j++;
                        else
                        k--;
                        
                       
                        
                        
                    
                    
                    
                }
            
        }
         return result;
        
    }
}