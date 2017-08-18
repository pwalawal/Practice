//Palindromic Substrings

/*
Given a string, your task is to count how many palindromic substrings in this string.
*/

class Solution {
    
    int count=0;
    
    
    public int countSubstrings(String s) {
    
        
        if(s==null || s.length()==0){
            return 0;
        }
        
        for(int i=0;i<s.length();i++){
            extendPalindrome(s,i,i);
            extendPalindrome(s,i,i+1);
        }
        
        return count;
        
    }
    
    public void extendPalindrome(String s,int start,int end){
        
        while(start>=0 && end<s.length() &&s.charAt(start)==s.charAt(end)){
            count++;
            start--;
            end++;
        }
        
    }
}