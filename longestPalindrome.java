/*
Longest Palindrome
Given a string which consists of lowercase or uppercase letters, find the length of the longest palindromes that can be built with those letters.

This is case sensitive, for example "Aa" is not considered a palindrome here.
*/

class Solution {
    
    
    public int longestPalindrome(String s) {
        
        if(s==null||s.length()==0){
            return 0;
        }
        
        int count=0;
        HashSet<Character>set=new HashSet<>();
        
        for(char c:s.toCharArray()){
            if(set.contains(c)){
                set.remove(c);
                count=count+2;
            }
            else{
                set.add(c);
            }
        }
        
        if(set.size()>0){
            count =count+1;
        }
        return count;
        
        
    }
}