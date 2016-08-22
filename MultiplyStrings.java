//Given two numbers represented as strings, return multiplication of the numbers as a string.

public class Solution {
    public String multiply(String num1, String num2) {
        
        
        if(num1.length()==0||num2.length()==0)
        {
            return "";
        
        }
        
        if(num1.equals("0")||num2.equals(0))
        {
            return "0";
        
        }
        String s1=new StringBuilder(num1).reverse().toString();
        String s2=new StringBuilder(num2).reverse().toString();
        
        int d[]=new int[num1.length()+num2.length()];
        
        for(int i=0;i<s1.length();i++)
        {
            for(int j=0;j<s2.length();j++)
            {
                d[i+j]+=(s1.charAt(i)-'0')*(s2.charAt(j)-'0');
            }
        }
        
        StringBuilder sb=new StringBuilder();
        
        for(int i=0;i<d.length;i++)
        {
            int mod=d[i]%10;
            int carry=d[i]/10;
            if(i+1<d.length)
            
        {
            d[i+1]=d[i+1]+carry;
        }
        sb.insert(0,mod);
        }
        
        while(sb.charAt(0) == '0' && sb.length()> 1){
        sb.deleteCharAt(0);
    }
 
    return sb.toString();
        
        
        
    }
}