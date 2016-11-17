//Given two non-negative numbers num1 and num2 represented as string, return the sum of num1 and num2.

public class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb=new StringBuilder();
        int len1=num1.length();
        int len2=num2.length();
        int carry=0;
        for(int i=len1-1,j=len2-1;i>=0||j>=0||carry==1;i--,j--)
        {
            int m=0,n=0;
            if(i>=0)
            {
                m=num1.charAt(i)-'0';
            }
            if(j>=0)
            {
                n=num2.charAt(j)-'0';
            }
            sb.append((m+n+carry)%10);
            carry=(m+n+carry)/10;
        }
        
        return sb.reverse().toString();
    }
}