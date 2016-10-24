//First Unique Character in a String

public class Solution {
    public int firstUniqChar(String s) {
        
        LinkedHashMap<Character, Integer> hm=new LinkedHashMap<Character, Integer>();
        LinkedHashMap<Character, Integer> result=new LinkedHashMap<Character,Integer>();
        
        for(int i=0;i<s.length();i++)
        {
            if(hm.containsKey(s.charAt(i)))
            {
                hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
            }
            else
            {
                hm.put(s.charAt(i),1);
                result.put(s.charAt(i),i);
            }
        }
        
        for(Character c:hm.keySet())
        {
            if(hm.get(c)==1)
            {
                return result.get(c);
            }
        }
        return -1;
        
        
    }
}