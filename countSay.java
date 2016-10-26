/*
The count-and-say sequence is the sequence of integers beginning as follows:
1, 11, 21, 1211, 111221, ...

1 is read off as "one 1" or 11.
11 is read off as "two 1s" or 21.
21 is read off as "one 2, then one 1" or 1211.
Given an integer n, generate the nth sequence.
*/


public class Solution {
    public String countAndSay(int n) {
        
        StringBuilder result=new StringBuilder("1");
        int temp=1;
        while(temp<n)
        {
            StringBuilder sb=new StringBuilder();
            int count=1;
            for(int i=0;i<result.length();i++)
            {
                if(i+1<result.length() && result.charAt(i) == result.charAt(i+ 1))
                {
                    count++;
                    
                }
                else
                {
                    sb.append(count);
                    sb.append(result.charAt(i));
                    count=1;
                }

            }
            
            result=sb;
            temp++;
            
            
        }
       return result.toString();
    }
}