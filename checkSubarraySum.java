class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
     
        if(nums == null || nums.length == 0)
		return false;
        
        HashMap<Integer,Integer>preSum=new HashMap<>();
        int sum=0;
        preSum.put(0,-1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(k!=0){
                sum=sum%k;
            }
            
            if(preSum.containsKey(sum)){
                if(i-preSum.get(sum)>1){
                    return true;
                }
            }else{
                preSum.put(sum,i);
            }
            
        }
        return false;
        
    }
}
