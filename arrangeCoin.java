/*
You have a total of n coins that you want to form in a staircase shape, where every k-th row must have exactly k coins.

Given n, find the total number of full staircase rows that can be formed.

n is a non-negative integer and fits within the range of a 32-bit signed integer.
*/


public class Solution {
    public int arrangeCoins(int n) {
       
       int row=1, count=0;
       while(n>0)
       {
           n=n-row;
           row++;
           count++;
       }
       if(n<0)
       {
           return count-1;
       }
       return count;
    }
}