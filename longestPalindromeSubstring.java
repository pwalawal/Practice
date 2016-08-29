public class Solution {
    public String longestPalindrome(String s) {
        
        if(s==null || s.isEmpty())
        {
            return null;
        }
        if(s.length()==1)
        {
            return s;
        }
        
        String lp=s.substring(0, 1);
        for(int i=0;i<s.length();i++)
        {
            //finding odd length longest palindrome substring
            String temp=findLongestPalindrome(s,i,i);
            
            if(lp.length()<temp.length())
            {
                lp=temp;
            }
            //finding even length longest palindrome substring
            temp=findLongestPalindrome(s,i,i+1);
            
            if(lp.length()<temp.length())
            {
                lp=temp;
            }
            
        }
        return lp;
        
        
    }
    
    public String findLongestPalindrome(String s,int start,int end)
    {
        if(start>=0 && end<=s.length()-1 && s.charAt(start)==s.charAt(end))
        {
            start--;
            end++;
        }
        String temp=s.substring(start+1,end);
        return temp;
    }
}