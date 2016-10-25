/*
 Given  an  arbitrary  ransom  note  string  and  another  string  containing  letters from  all  the  magazines,  write  a  function  that  will  return  true  if  the  ransom   note  can  be  constructed  from  the  magazines ;  otherwise,  it  will  return  false.   

Each  letter  in  the  magazine  string  can  only  be  used  once  in  your  ransom  note.
*/

public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
        for(int i=0;i<magazine.length();i++)
        {
            if(hm.containsKey(magazine.charAt(i)))
            {
                hm.put(magazine.charAt(i),hm.get(magazine.charAt(i))+1);
            }
            else
            {
                hm.put(magazine.charAt(i),1);
            }
        }
        
        for(int i=0;i<ransomNote.length();i++)
        {
            if(!hm.containsKey(ransomNote.charAt(i)))
            {
                return false;
            }
            else
            {
                if(hm.get(ransomNote.charAt(i))==1)
                {
                    hm.remove(ransomNote.charAt(i));
                }
                else
                {
                    hm.put(ransomNote.charAt(i),hm.get(ransomNote.charAt(i))-1);
                }
                
            }
        }
        
        return true;

    }
}