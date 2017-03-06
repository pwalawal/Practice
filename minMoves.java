//Minimum Moves to Equal Array Elements


public class Solution {
    public int minMoves(int[] nums) {
        
        
        /*
        Increasing n - 1 elements by 1 has the same effect of decreasing 1 element by 1
		find the minimum value of the array and count the steps of decreasing every element to the minimum.
        */
        int min=Integer.MAX_VALUE;
        int count=0;
        
        for(int num:nums){
            min=Math.min(num,min);
        }
        
        for(int num:nums){
            count+=num-min;
        }
        return count;
        
        
    }
}