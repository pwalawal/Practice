//Given a set of distinct integers, nums, return all possible subsets.

public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        
        List<List<Integer>> result=new ArrayList<>();
        List<Integer>set=new ArrayList<>();
        result.add(new ArrayList<Integer>(set));
        if(nums==null)
        {
            return result;
        }
        
        Arrays.sort(nums);
        
        
        for(int num:nums)
        {
            int size=result.size();
            for(int i=0;i<size;i++)
            {
                set=new ArrayList<>(result.get(i));
                set.add(num);
                result.add(set);
                //set.clear();
            }
        }
        
        return result;
        
    }
}