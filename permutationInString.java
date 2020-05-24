class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        if(s2.length()<s1.length()){
            return false;
        }
        
        int map[]=new int[256];
        
        for(char c:s1.toCharArray()){
            map[c]++;
        }
        
        int start=0,end=0,counter=s1.length();
        
        while(end<s2.length()){
            char c1=s2.charAt(end);
            if(map[c1]>0){
                counter--;
            }
            map[c1]--;
            end++;
            
            while(counter==0){
                if(end-start==s1.length()){
                    return true;
                }
                
                char c2=s2.charAt(start);
                if(++map[c2]>0){
                    counter++;
                }
                start++;
            }
        }
        return false;
    }
}
