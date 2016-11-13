//Given an array S of n integers, are there elements a, b, c, and d in S such that a + b + c + d = target? Find all unique quadruplets in the array which gives the sum of target.

public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        List<List<Integer>> result=new ArrayList<>();
        
        Arrays.sort(nums);
        if(nums==null || nums.length<4)
        return result;
        
        for(int i=0;i<nums.length-3;i++)
        {
            if(i!=0 && nums[i]==nums[i-1])
            {
                continue;
            }
            
            for(int j=i+1;j<nums.length-2;j++)
            {
                if(j!=i+1 && nums[j]==nums[j-1])
                {
                    continue;
                }
                
                int k=j+1;
                int l=nums.length-1;
                while(k<l)
                {
                    if(nums[i]+nums[j]+nums[k]+nums[l]==target)
                    {
                        List<Integer> temp=new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        temp.add(nums[l]);
                        
                        result.add(temp);
                      
                        
                        
                        while(k<l && nums[l]==nums[l-1])
                        {
                            l--;
                        }
                        while(k<l && nums[k]==nums[k+1])
                        {
                            k++;
                        }
                        k++;
                        l--;
                        
                       
                        
                    }
                    
                    else if(nums[i]+nums[j]+nums[k]+nums[l]<target)
                    {
                        k++;
                    }
                    else
                    {
                        l--;
                    }
                }
                
                
            }
        }
        
        
        return result;
        
    }
}