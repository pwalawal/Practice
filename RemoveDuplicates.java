/*Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.*/

public class Solution {
    public int removeDuplicates(int[] nums) {
        
        
        if (nums.length < 2)
		return nums.length;
 
	int j = 0;
	int i = 1;
 
	while (i < nums.length) {
		if (nums[i] == nums[j]) {
			i++;
		} else {
			j++;
			nums[j] = nums[i];
			i++;
		}
	}
 
	return j + 1;
    }
}