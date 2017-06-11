public class Solution {
    
    private Set<Integer>col=new HashSet<>();
    private Set<Integer>diag1=new HashSet<>();
    private Set<Integer>diag2 =new HashSet<>();
    
    public List<List<String>> solveNQueens(int n) {
        
        List<List<String>> list=new ArrayList<>();
        backtrack(list,new ArrayList<String>(),0,n);
        return list;
    }
    
    public void backtrack(List<List<String>> list,List<String> temp,int row,int n){
        
        if(row==n){
            list.add(new ArrayList<String>(temp));
        }
        
        for(int i=0;i<n;i++){
            if(col.contains(i)||diag1.contains(row+i)||diag2.contains(row-i)){
                continue;
            }
            
            char[] ch=new char[n];
            Arrays.fill(ch,'.');
            ch[i]='Q';
            String s=new String(ch);
            
            temp.add(s);
            col.add(i);
            diag1.add(row+i);
            diag2.add(row-i);
            
            backtrack(list,temp,row+1,n);
            
            temp.remove(temp.size()-1);
            col.remove(i);
            diag1.remove(row+i);
            diag2.remove(row-i);
        }
        
    }
}