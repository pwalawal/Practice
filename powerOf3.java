//Given an integer, write a function to determine if it is a power of three.

public class Solution {
    public boolean isPowerOfThree(int n) {
        
        while(n>0)
        {
            if(n==1)
            return true;
            
            if(n%3==0)
            {
                n=n/3;
            }
            else
            {
                return false;
            }
        }
        return false;
        
    }
}