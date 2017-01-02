//Subsets 2

public class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result=new ArrayList<>();
        backtrack(nums,0,new ArrayList<Integer>(),result);
        return result;
    }
    
    public void backtrack(int[]nums, int start, List<Integer> temp,List<List<Integer>> result){
        result.add(new ArrayList<>(temp));
        for(int i=start;i<nums.length;i++){
            if(i>start && nums[i]==nums[i-1])
            {
                continue;
            }
            List<Integer> tempList=new ArrayList<>(temp);
            tempList.add(nums[i]);
            backtrack(nums,i+1,tempList,result);
            //temp.remove(temp.size()-1);
        }
    }
}