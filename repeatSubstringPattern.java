/*
Given a non-empty string check if it can be constructed by taking a substring of it and appending multiple copies of the substring together. You may assume the given string consists of lowercase English letters only and its length will not exceed 10000.
*/

public class Solution {
    public boolean repeatedSubstringPattern(String str) {
        
        int len=str.length();
        int j;
        for(int i=len/2;i>=1;i--)
        {
            if(len%i==0)
            {
                int n=len/i;
                String temp=str.substring(0,i);
                for(j=1;j<n;j++)
                {
                    if(!temp.equals(str.substring(i*j,i+i*j)))
                        break;
                    
                }
                if(j==n)
                    return true;
            }
        }
        return false;
        
    }
}