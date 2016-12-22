//Jump Game II

public class Solution {
    public int jump(int[] nums) {
        
        int jump=0, edge=0, max=0;
        for(int i=0;i<nums.length-1;i++){
            max=Math.max(max,i+nums[i]);
            if(i==edge){
                jump++;
                edge=max;
            }
        }
        return jump;
        
    }
}