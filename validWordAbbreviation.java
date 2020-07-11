class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        
        int idx=0;
        int num=0;
        
        if(word==null||word.length()==0){
            return false;
        }
        
        for(char c:abbr.toCharArray()){
            if(Character.isDigit(c)){
                num=num*10+(c-'0');
                if(num==0){
                    return false;
                }
                
            }else{
                idx+=num;
                if(idx>=word.length()||word.charAt(idx)!=c){
                    return false;
                }
                idx++;
                num=0;
                
            }
        }
        
        return idx+num==word.length();
        
    }
}
