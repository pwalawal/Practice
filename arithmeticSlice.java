/*
A sequence of number is called arithmetic if it consists of at least three elements and if the difference between any two consecutive elements is the same.
*/

public class Solution {
    public int numberOfArithmeticSlices(int[] A) {
        int temp=0, result=0;
        for(int i=2;i<A.length;i++)
        {
            if(A[i]-A[i-1]==A[i-1]-A[i-2])
            {
                temp++;
                result=result+temp;
            }
            else
            {
                temp=0;
            }
        }
        return result;
    }
}