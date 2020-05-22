class Solution {
    public int findPeakElement(int[] nums) {
        
        int leftMax=0;
        int i=0;
        
        while(i<nums.length-1){
            if(nums[i]>leftMax && nums[i]>nums[i+1]){
                return i;
            }else{
                leftMax=nums[i++];
            }
        }
        
        if(i==nums.length-1 && nums[i]>leftMax){
            return i;
        }
        
        return 0;
        
        
    }
}
