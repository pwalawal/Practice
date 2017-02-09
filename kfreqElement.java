// Top K Frequent Elements

public class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int n:nums){
            map.put(n,map.containsKey(n)?map.get(n)+1:1);
        }
        
        List<Integer> bucket[]=new List[nums.length+1];
        
        for(int n:map.keySet()){
            int freq=map.get(n);
            if(bucket[freq]==null){
                bucket[freq]=new LinkedList<>();
            }
            bucket[freq].add(n);
        }
        
        List<Integer> result=new ArrayList<>();
        for(int pos=bucket.length-1;pos>=0 && result.size()<k;pos--){
            if(bucket[pos]!=null){
                result.addAll(bucket[pos]);
            }
        }
        return result;
    }
}