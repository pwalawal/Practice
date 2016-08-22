//Implement strStr().

//Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

public class Solution {
    public int strStr(String haystack, String needle) {
        if(needle==null||haystack==null)
        return 0;
        if(needle.length()==0)
        return 0;
        
        int len=needle.length();
        for(int i=0;i<haystack.length()-len+1;i++)
        {
            if(haystack.substring(i,i+len).equals(needle))
            {
                return i;
            }
        }
        return -1;
    }
}