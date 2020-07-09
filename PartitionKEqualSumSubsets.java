class Solution {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        
        if(k<=0 || sum%k!=0 ){
            return false;
        }
        
        boolean visited[]=new boolean[nums.length];
        
        return canPartition(nums,k,visited,0,0,sum/k);
        
    }
    public boolean canPartition (int[] nums, int k, boolean []visited, int start, int sum, int target){
        
        if(k==0){
            return true;
        }
        if(sum>target){
            return false;
        }
        if(sum==target){
            return canPartition(nums,k-1,visited,0,0,target);
        }
        
        for(int i=start;i<nums.length;i++){
            if(!visited[i]){
                visited[i]=true;
                if(canPartition(nums,k,visited,i+1,sum+nums[i],target)){
                    return true;
                }
                visited[i]=false;
            }
            
        }
        return false;
        //O(k*2^n). Its a NP hard problem
        
    }
}
