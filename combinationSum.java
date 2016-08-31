//Combination Sum


public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        Arrays.sort(candidates);
        List<Integer> al=new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        if(candidates.length==0||candidates==null)
        {
            return result;
        }
        
        
        combineSum(0,candidates,target,al,result);
        return result;
        
        
    }
    
    public void combineSum(int start,int[] candidates, int target,List<Integer>al, List<List<Integer>>result)
    {
        if(target==0)
        {
            result.add(new ArrayList<Integer>(al));
            return ;
        }
        
        for(int i=start;i<candidates.length;i++)
        {
            if(candidates[i]>target)
            {
                return;
            }
            
            al.add(candidates[i]);
            combineSum(i,candidates,target-candidates[i],al,result);
            al.remove(al.size() - 1);
        }
        
        
    }
}