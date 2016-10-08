//Count the number of prime numbers less than a non-negative number, n.

public class Solution {
    public int countPrimes(int n) {
        
        boolean isPrime[]=new boolean[n];
        
        int result=0;
        for(int i=2;i<n;i++){
            int j=1;
            if(isPrime[i]==false)
            {
                result++;
            }
            while(j*i<n)
            {
                isPrime[i*j]=true;
                j++;
            }
        }
        return result;

        
    }
}