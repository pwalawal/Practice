//Valid Parenthesis String

class Solution {
    public boolean checkValidString(String s) {
        
        return check(s,0,0);
        
    }
    
    public boolean check(String s, int start,int count){
        if(count<0){
            return false;
        }
        
        for(int i=start;i<s.length();i++){
            if(s.charAt(i)=='('){
                count++;
            }
            if(s.charAt(i)==')'){
                count--;
                if(count<0){
                    return false;
                }
            }
            
            else if(s.charAt(i)=='*'){
                return check(s,i+1,count+1)||check(s,i+1,count-1)||check(s,i+1,count);
            }
        }
        
        return count==0;
    }
}