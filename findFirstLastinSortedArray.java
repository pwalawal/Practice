class Solution {
    public int[] searchRange(int[] nums, int target) {
        
     int result[]=new int[]{-1,-1};
        
        if(nums==null|| nums.length==0){
            return result;
        }
        
        result[0]=findFirstLast(nums, target,true);
        result[1]=findFirstLast(nums,target,false);
        
        return result;
    }
    
    public int findFirstLast(int[] nums, int target, boolean isFirst){
        
        int start=0,end=nums.length-1;
        
        int idx=-1;
        
        
        while(start<=end){
            
            int mid=(start+end)/2;
            
            if(nums[mid]>target){
                end=mid-1;
            }
            else if(nums[mid]<target){
                    start=mid+1;
                }else{
                idx=mid;
                if(isFirst){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
                        
                  
                }
            }
            
            return idx;
        }
    }
