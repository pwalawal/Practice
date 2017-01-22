/*
Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.

Find all the elements that appear twice in this array.
*/

public class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int index=Math.abs(nums[i]);
            if(nums[index-1]<0){
                result.add(Math.abs(nums[i]));
            }
            else{
                nums[index-1]=-nums[index-1];
            }
        }
        return result;
    }
}