//Range Sum Query - Immutable

public class NumArray {
        private int dp[];
    public NumArray(int[] nums) {
        if(nums.length!=0){
            dp=new int[nums.length];
       
       
        dp[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            dp[i]=dp[i-1]+nums[i];
        }
        }
        
    }

    public int sumRange(int i, int j) {
        if(i==0){
            return dp[j];
        }
        else{
            return dp[j]-dp[i-1];
        }
    }
}


// Your NumArray object will be instantiated and called as such:
// NumArray numArray = new NumArray(nums);
// numArray.sumRange(0, 1);
// numArray.sumRange(1, 2);