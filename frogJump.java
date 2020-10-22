class Solution {
    public boolean canCross(int[] stones) {
        
        if(stones[1]!=1)return false;
        HashSet<Integer>set=new HashSet<>();
        //store locations
        
        for(int i=0;i<stones.length;i++){
            if(i>0 && stones[i]-stones[i-1]>i)return false;
            set.add(stones[i]);
        }
        return helper(set,1,1,stones[stones.length-1]);
    }
    
    public boolean helper(HashSet<Integer>set, int pos,int step, int destination){
        
        if(step<=0)return false;
        if(!set.contains(pos))return false;
        
        if(pos==destination || (destination<=pos+step+1 && destination>=pos+step-1 ))return true;
        
        return helper(set,pos+step+1,step+1,destination)||helper(set,pos+step,step,destination)||helper(set,pos+step-1,step-1,destination);
        
    }
}
