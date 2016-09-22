/*
Valid Palindrome
Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
*/

public class Solution {
    public boolean isPalindrome(String s) {
        String replace="[^0-9a-zA-Z]";
        //replace all non alphanumeric characters to white space
        s = s.replaceAll(replace, "").toLowerCase();
        if(s.length()==0)
        {
            return true;
            //empty string
        }
        int len=s.length()-1;
        for(int i=0;i<s.length()-1/2;i++)
        {
            if(s.charAt(i)!=s.charAt(len--))
            {
                return false;
            }
        }
        return true;
    }
}