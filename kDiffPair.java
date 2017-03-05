//K-diff Pairs in an Array

public class Solution {
    public int findPairs(int[] nums, int k) {
        
        if(k<0){
            return 0;
        }
        int count=0;
        HashMap<Integer, Integer> map=new HashMap<Integer,Integer>();
        
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        
        for(int entry:map.keySet()){
            if(k==0){
                if(map.get(entry)>=2)
                 count++;
            }
            else{
                if(map.containsKey(entry-k)){
                    count++;
                }
            }
        }
        return count;
    }
}