//Guess Number Higher or Lower

/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        
            return guessNumber(1,n);
    }
    
    public int guessNumber(int low,int high)
    {
        if(low>high)
        {
            return low;
        }
        
        int mid=low+(high-low)/2;
        if(guess(mid)==0)
        {
            return mid;
        }
        else if(guess(mid)>0)
        {
            return guessNumber(mid+1,high);
        }
        else
        {
            return guessNumber(low,mid-1);
        }
        
       
    }
    
    
    
}
