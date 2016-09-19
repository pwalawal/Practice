/*
Plus One
Given a non-negative number represented as an array of digits, plus one to the number.

The digits are stored such that the most significant digit is at the head of the list.
*/


public class Solution {
    public int[] plusOne(int[] digits) {
        
        int carry=1;
        int len=digits.length-1;
        for(int i=len;i>=0;i--)
        {
            digits[i]=digits[i]+carry;
            if(digits[i]<10)
            {
                carry=0;
            }
            else
            {
                digits[i]=digits[i]%10;
            }
        }
        
        if(carry==1)
        {
            int i=0;
            int[] result=new int[len+2];
            result[i++]=1;
            for(int num : digits)
            {
                result[i++]=num;
            }
            return result;
        }
        
        return digits;
        
    }
}