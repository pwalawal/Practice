class Solution {
    public int longestSubstring(String s, int k) {
       
        return helper(s,0,s.length(),k);
        //call divide and conquesr function
        
    }
    
    public int helper(String s,int start,int end, int k){
        
        if(end-start<k){
            return 0;
            //string shorter than k then no char can be repeated k times
        }
        
        int []ch=new int[26];
        
        for(int i=start;i<end;i++){
            ch[s.charAt(i)-'a']++;
        }
        
        for(int i=0;i<ch.length;i++){
            //check if char occcurs more than once but less than k then the ans will be in either left or right substring
            
            if(ch[i]>0 && ch[i]<k){
                for(int j=start;j<end;j++){
                    if(s.charAt(j)==i+'a'){
                        int left=helper(s,start,j,k);
                        int right=helper(s,j+1,end,k);
                        return Math.max(left,right);
                    }
                }
            }
            
        }
        
        return end-start;
        
        
    }
}
