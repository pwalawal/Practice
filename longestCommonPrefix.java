//Write a function to find the longest common prefix string amongst an array of strings.

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        if(strs==null||strs.length==0)
        {
            return "";
        }
        
        int len=Integer.MAX_VALUE;
        String result="";
        
        for(String str:strs)
        {
            if(str.length()<len)
            {
                len=str.length();
                result=str;
            }
        }
        
        for(String str:strs)
        {
            for(int i=0;i<result.length();i++)
            {
             if(str.charAt(i)!=result.charAt(i))
             {
                 result=result.substring(0,i);
             }
                
            }
        }
        return result;
    }
}