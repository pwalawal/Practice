//Factorial Trailing Zeroes

public class Solution {
    public int trailingZeroes(int n) {
        //0 is formed by multiplication of 5 and 2 . 
        //Find the number of 5 in the number.
        int total=0;
        while(n>0){
            n=n/5;
            total=total+n;
        }
        
        return total;
    }
}