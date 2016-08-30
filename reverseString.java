//Write a function that takes a string as input and returns the string reversed.

public class Solution {
    public String reverseString(String s) {
        
        String result="";
        for(int i=s.length()-1;i>=0;i--)
        {
           result=result+s.charAt(i); 
        }
        return result;
    }
}