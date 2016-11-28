/*
Write a function that takes a string as input and reverse only the vowels of a string.
*/

public class Solution {
    public String reverseVowels(String s) {
        
        HashSet<Character> hs=new HashSet<Character>();
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
        
        char[] str=s.toCharArray();
        int start=0;
        int end=s.length()-1;
        
        while(start<end){
            
            while(start<end && !hs.contains(str[start])){
                start++;
            }
            while(start<end && !hs.contains(str[end])){
                end--;
            }
            
            char temp=str[start];
            str[start]=str[end];
            str[end]=temp;
            
            start++;
            end--;
        }
        String result=new String(str);
        return result;
    }
}