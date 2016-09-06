//Given two integers n and k, return all possible combinations of k numbers out of 1 ... n.


public class Solution {
    public List<List<Integer>> combine(int n, int k) {
        
        List<Integer> al=new ArrayList<>();
        List<List<Integer>> result=new ArrayList<>();
        if(k<0||n<k)
        {
            return result;
        }
        
        combineSet(1,n,k,al,result);
        return result;
        
    }
    
    public void combineSet(int start, int n, int k, List<Integer>al, List<List<Integer>>result)
    {
        if(k==0)
        {
            result.add(new ArrayList<Integer>(al));
            return ;
        }
        
        for(int i=start;i<=n;i++)
        {
            al.add(i);
            combineSet(i+1,n,k-1,al,result);
            al.remove(al.size() - 1);
            
        }
    }
}