//Given two strings s and t, write a function to determine if t is an anagram of s.

public class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length()!=t.length()||s==null||t==null)
        return false;
        HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
        
        for(int i=0;i<s.length();i++)
        {
            char c1=s.charAt(i);
            if(hm.containsKey(c1))
            {
                hm.put(c1,hm.get(c1)+1);
            }
            else
            hm.put(c1,1);
        }
        
        for(int i=0;i<s.length();i++)
        {
            char c2=t.charAt(i);
            if(hm.containsKey(c2))
            {
                if(hm.get(c2)==1)
                {
                    hm.remove(c2);
                }
                else
                {
                    hm.put(c2,hm.get(c2)-1);
                }
            }
            else
            return false;
            
        }
        
        if(hm.size()>0)
        return false;
        
        return true;
        
        
    }
}