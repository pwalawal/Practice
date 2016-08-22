//Given numRows, generate the first numRows of Pascal's triangle.

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        
        if(numRows==0)
        return result;
        
        ArrayList<Integer> temp=new ArrayList<Integer>();
        
        temp.add(1);
        result.add(temp);
        
        for(int i=2;i<=numRows;i++)
        {
            ArrayList<Integer> curr=new ArrayList<Integer>();
            curr.add(1);
            for(int j=0;j<temp.size()-1;j++)
            {
                curr.add(temp.get(j)+temp.get(j+1));
            }
            curr.add(1);
            result.add(curr);
            temp=curr;
            
            
        }
        return result;
        
        
    }
}