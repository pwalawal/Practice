/*
Given two strings s and t, determine if they are isomorphic.

Two strings are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.
*/

public class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        if(s==null||t==null)
        return false;
        
        boolean result=false;
        char s1[]=s.toCharArray();
        char s2[]=t.toCharArray();
        
        HashMap<Character,Character> lhm1=new LinkedHashMap<Character,Character>();

        
      
        for(int i=0;i<s1.length;i++)
        {
           
            if(lhm1.containsKey(s1[i]))
            {
                
                if(lhm1.get(s1[i])!=s2[i])
                return result;
            }
            else
            {
                if(lhm1.containsValue(s2[i]))
                
                return result;
                
                lhm1.put(s1[i],s2[i]);
            }
            
           
        }
        
        
        return true;
    }
}