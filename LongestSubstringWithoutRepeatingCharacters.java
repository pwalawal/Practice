//Given a string, find the length of the longest substring without repeating characters.

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s==null){
        return 0;
    }
 
    int max = 0;
 
    HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    int start=0;
 
    for(int i=0; i<s.length(); i++){
        char c = s.charAt(i);
        if(map.containsKey(c)){
            max = Math.max(max, map.size());    
            while(map.containsKey(c)){
                map.remove(s.charAt(start));
                start++;
            }
 
            map.put(c, i);
        }else{
            map.put(c, i);
        }
    }
 
    max = Math.max(max, map.size());  
 
    return max;
    }
}