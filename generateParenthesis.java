//Generate Parentheis

public class Solution {
    public List<String> generateParenthesis(int n) {
        
        if(n==0)
        return null;
        ArrayList<String> result=new ArrayList<String>();
        String s="";
        
        dfs(s,n,n,result);
        return result;
    }
    //start is for left parenthesis and end is for right parentheis
    public void dfs(String s,int start,int end,ArrayList<String> result)
    {
        if(start>end)
        {
           return;
        }
        if(start==0 && end==0)
        {
            result.add(s);
            return;
        }
        
        if(start>0)
        {
            dfs(s+"(",start-1,end,result);
        }
        if(end>0)
        {
            dfs(s+")",start,end-1,result);
        }
    }
    
}