//Given an array of strings, group anagrams together.

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> result=new ArrayList<List<String>>();
       
        HashMap<String,ArrayList<String>> hm=new HashMap<String,ArrayList<String>>();
        
        
        
        for(String str:strs)
        {
            char arr[]=new char[26];
            for(int i=0;i<str.length();i++)
            {
                arr[str.charAt(i)-'a']++;
            }
            String ns=new String(arr);
            if(hm.containsKey(ns))
            {
                hm.get(ns).add(str);
            }
            else
            {
                ArrayList<String> al = new ArrayList<String>();
                al.add(str);
                hm.put(ns, al);
            }
            
        }
         result.addAll(hm.values());
 
    return result;
        
        
    }
}