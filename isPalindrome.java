//Check whether integer is Palindrome

public class Solution {
    public boolean isPalindrome(int x) {
        
        int temp=x;
        int res=0;
        int rem;
        if(x<0)
        return false;
        
        while(x>0)
        {
            rem=x%10;
            res=(res*10)+rem;
            x=x/10;
        }
        
        if(temp==res)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}