//Reverse String II

public class Solution {
    public String reverseStr(String s, int k) {
        
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length;i=i+2*k){
            swap(ch,i,i+k);
        }
        return String.valueOf(ch);
        
    }
    
    public void swap(char[] ch, int i, int j){
        j=Math.min(ch.length,j)-1;
        while(i<j){
            char temp=ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            i++;j--;
        }
        
    }
}