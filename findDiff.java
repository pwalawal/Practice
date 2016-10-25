/*
Given two strings s and t which consist of only lowercase letters.

String t is generated by random shuffling string s and then add one more letter at a random position.

Find the letter that was added in t
*/

public class Solution {
    public char findTheDifference(String s, String t) {
        
         HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++)
        {
            if(hm.containsKey(s.charAt(i)))
            {
                hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
            }
            else
            {
                hm.put(s.charAt(i),1);
            }
        }
        
        for(int i=0;i<t.length();i++)
        {
            if(!hm.containsKey(t.charAt(i)))
            {
                return t.charAt(i);
            }
            else
            {
                if(hm.get(t.charAt(i))==1)
                {
                    hm.remove(t.charAt(i));
                }
                else
                {
                    hm.put(t.charAt(i),hm.get(t.charAt(i))-1);
                }
                
            }
        }
        
        return 'a';

    }
}