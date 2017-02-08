//Combination Sum III

public class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        
        List<List<Integer>> list=new ArrayList<>();
        backtrack(list,new ArrayList<Integer>(),k,n,1);
        return list;
    }
    public void backtrack(List<List<Integer>> list,List<Integer> temp,int k,int n,int start){
        if(temp.size()>k){
            return;
        }
        else if(temp.size()==k && n==0){
            list.add(new ArrayList<Integer>(temp));
        }
        else{
            for(int i=start;i<10;i++){
                temp.add(i);
                backtrack(list,temp,k,n-i,i+1);
                temp.remove(temp.size()-1);
            }
            
        }
        
    }
}