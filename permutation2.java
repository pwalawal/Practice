//Permuatation with unique members

public class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        
        List<List<Integer>> result= new ArrayList<List<Integer>>();
        
        result.add(new ArrayList<Integer>());
        
        for(int i=0;i<nums.length;i++)
        {
            Set<List<Integer>> set=new HashSet<List<Integer>>();
            for(List<Integer> al:result)
            {
                for(int j=0;j<=al.size();j++)
                {
                    al.add(j,nums[i]);
                    ArrayList<Integer> temp=new ArrayList<Integer>(al);
                    al.remove(j);
                    set.add(temp);
                    
                }
            }
            
            result=new ArrayList<>(set);
        }
        
        return result;
    }
}