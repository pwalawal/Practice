/*
Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
*/

public class Solution {
    public int addDigits(int num) {
        
        if(num<10)
        {
            return num;
        }
        
        int result=num;
        while(result>=10)
        {
            int temp=0;
            while(result>0)
            {
                temp=temp+result%10;
                result=result/10;
            }
            
            result=temp;
            
        }
        return result;
    }
}