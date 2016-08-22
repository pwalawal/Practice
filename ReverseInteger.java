/*
Reverse digits of an integer.

Example1: x = 123, return 321
Example2: x = -123, return -321
*/



public class Solution {
    public int reverse(int x) {
      
        
       boolean sign = false;
	if (x < 0) {
	//checks whether the number is negative
		x=0-x;
		sign = true;
	}
 
	long ans=0,carry = 0;
	
 
	while (x > 0) {
		carry= x % 10;
		x = x / 10;
		ans = ans * 10 + carry;
		//reverses the integer
	}
 
	if (sign==true) {
		ans = 0 - ans;
		//if the original number was negaive, convert the answer to negative
	}
	
	if(ans>Integer.MAX_VALUE||ans<Integer.MIN_VALUE)
		//checks whether the number is greater than Max or lesser than Min value of integer
		return 0;
	else
 		//return the ans as integer.
		return (int) ans;
	
    }
}