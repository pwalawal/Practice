class Solution {

    int nums[];
    Random rand;
    public Solution(int[] nums) {
        this.nums=nums;
        rand=new Random();
    }
    
    public int pick(int target) {
        
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                count++;
            }
        }
        
        int index=rand.nextInt(count);
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                if(index--==0){
                    return i;
                }
            }
        }
        return -1;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */
