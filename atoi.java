//String to integer

public class Solution {
    public int myAtoi(String str) {
        
        str=str.trim();
        if(str==null||str.length()==0)
        {
            return 0;
        }
        int i=0;
        double result=0;
        
        int sign=1;
        if(str.charAt(i)=='-')
        {
            sign=-1;
            i++;
        }
        else if(str.charAt(i)=='+')
        {
            i++;
        }
        
        while(i<str.length() && str.charAt(i)>='0' && str.charAt(i)<='9')
        {
            int num=str.charAt(i)-'0';
            result=(result*10)+num;
            i++;
        }
        
        result=result*sign;
        
        if(result>Integer.MAX_VALUE)
        {
            result=Integer.MAX_VALUE;
        }
        else if(result<Integer.MIN_VALUE)
        {
            result=Integer.MIN_VALUE;
        }
        return (int)result;
    }
}