//Implement int sqrt(int x).

public class Solution {
    public int mySqrt(int x) {
        
        if(x==0||x==1)
        {
            return x;
        }
        long start=0;
        long end=x;
        long mid=0,result=0;
        //binary search method
        while(start <=end)
        {
            mid=(start+end)/2;
            result=mid*mid;
            if(x==result)
            {
                return (int)mid;
            }
            else if(result<x)
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return (int)end;
        
    }
}