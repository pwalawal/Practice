
//Integer replacement


public class Solution { 
    public int integerReplacement(int n) { 
         
        int count= helper(n,0); 
        return count;
        
    } 
    public int helper(int n, int count) {
        if(n<=1) { 
            return 0; 
            
        }
        if(n==1) { 
            return count; 
            
        } 
        if(n%2==0) { 
            return helper(n/2,count+1); 
            
        } 
        else { 
            return Math.min(helper(n-1,count+1),helper(n+1,count+1)); 
            
        } 
        
    } 
    
}