//Reverse Vowels in a String

public class Solution {
    public String reverseVowels(String s) {
        
        HashSet<Character>hs=new HashSet<Character>();
        hs.add('a');
        hs.add('e');
        hs.add('i');
        hs.add('o');
        hs.add('u');
        hs.add('A');
        hs.add('E');
        hs.add('I');
        hs.add('O');
        hs.add('U');
        
        //s=s.toLowerCase();
        // if the answer required is not case sensitive then hashset can contain only small case vowels and the string can be converted to lower case
        char[] temp=s.toCharArray();
        int start=0;
        int end=s.length()-1;
        
        while(start<end)
        {
            while (start < end && !hs.contains(temp[start]))
            {
                start++;
                        
            }
           while (start < end && !hs.contains(temp[end])) {
                end--;
            }
            
            if(start<end)
            {
                char t=temp[start];
                temp[start]=temp[end];
                temp[end]=t;
                start++;
                end--;
            }
            
            
            
            
        }
        return new String(temp);
         
    }
}