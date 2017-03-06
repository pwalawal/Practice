//Sort Characters By Frequency

public class Solution {
    public String frequencySort(String s) {
        
        Map<Character,Integer>map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        ArrayList<Character> bucket[]=new ArrayList[s.length()+1];
        for(char key:map.keySet()){
            int count=map.get(key);
            if(bucket[count]==null){
                bucket[count]=new ArrayList<Character>();
            }
            bucket[count].add(key);
        }
        
        StringBuilder sb=new StringBuilder();
        for(int i=bucket.length-1;i>=0;i--){
            if(bucket[i]!=null){
                for(char c:bucket[i]){
                    for(int j=0;j<i;j++){
                        sb.append(c);
                    }
                }
            }
        }
        
        return sb.toString();
    }
}