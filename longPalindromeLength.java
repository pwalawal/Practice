/*
Given a string which consists of lowercase or uppercase letters, find the length of the longest palindromes that can be built with those letters.

This is case sensitive, for example "Aa" is not considered a palindrome here.
*/

public class Solution {
    public int longestPalindrome(String s) {
        
       HashSet<Character> hs=new HashSet<Character>();
       int count=0;
       for(int i=0;i< s.length();i++)
       {
           if(hs.contains(s.charAt(i)))
           {
               hs.remove(s.charAt(i));
               count=count+2;
           }
           else
           {
               hs.add(s.charAt(i));
           }
       }
       
       if(hs.size()==0)
       {
           return count;
       }
       else
       {
           return count+1;
       }
        
    }
}