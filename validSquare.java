/*
Given a positive integer num, write a function which returns True if num is a perfect square else False.

Note: Do not use any built-in library function such as sqrt.
*/

public class Solution {
    public boolean isPerfectSquare(int num) {
        
        for(int i=1;i<=num/i;i++)
        {
            if(i*i==num)
            {
                return true;
            }
        }
        return false;
        
    }
}