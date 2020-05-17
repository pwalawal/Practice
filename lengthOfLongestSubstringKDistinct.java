class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        
      
        int map[]=new int[256];
        
        int distinct=0;
        int i=0,j=0;
        int maxLen=0;
        
        if(s==null ||s.length()==0){
            return maxLen;
        }
        
        while(i<s.length()){
            
            if(map[s.charAt(i)]++==0){
              distinct++;   
            }
            i++;
            while(distinct>k){
                
                
                map[s.charAt(j)]--;
                if(map[s.charAt(j)]==0){
                    distinct--;
                }
                j++;
                //maxLen=Math.max(maxLen,i-j);
            }
            maxLen=Math.max(maxLen,i-j);
            
        }
        //maxLen=Math.max(maxLen,i-j);
        
        return maxLen;
        
        
        
        
    }
}
