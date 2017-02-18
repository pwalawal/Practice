// Shortest Palindrome

public class Solution {
    public String shortestPalindrome(String s) {
        int i=0,j=s.length()-1;
        int end=j;
        char[] ch=s.toCharArray();
        while(i<j){
            if(ch[i]==ch[j]){
                i++;j--;
            }
            else{
                i=0;
                end--;
                j=end;
            }
        }
        
        StringBuilder sb=new StringBuilder(s.substring(end+1));
        
        String result=sb.reverse().toString()+s;
        return result;
    }
}