
//Search for a Range

public class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int i =0;
        int j=nums.length-1;
        
        int []result=new int[2];
        result[0]=-1;
        result[1]=-1;
        

        
        while(i<=j)
        {
            int mid=(i+j)/2;
            if(target>nums[mid])
            {
                i=mid+1;
            }
            else if(target<nums[mid])
            {
                j=mid-1;
            }
            else
            {
                result[0]=mid;
                result[1]=mid;
                
                int temp=mid;
                while(temp>i && target==nums[temp-1])
                {
                    temp--;
                    
                }
                result[0]=temp;
                temp=mid;
                while(temp<j && target==nums[temp+1])
                {
                    temp++;
                    
                }
                result[1]=temp;
                return result;
            }
            
            
        }
        return result;
    }
}