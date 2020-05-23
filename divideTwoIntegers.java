class Solution {
    public int divide(int dividend, int divisor) {
        
        if(dividend==Integer.MIN_VALUE && divisor==-1){
            return Integer.MAX_VALUE;
        }
        
        boolean sign=(dividend<0 == divisor<0);
        dividend=dividend<0?dividend:-dividend;
        divisor=divisor<0?divisor:-divisor;
        //turn everything to negative value and keep finding closest 1,2,4,8... multiples and recursive on rest
        int result=helper(dividend,divisor);
        
            return sign==true?result:-result;
    }
    
    public int helper(int dividend,int divisor){
        
        int total=divisor;
        int prev=0,result=0;
        
        while(dividend<=total){
            
            result=result==0?1:result+result;
            prev=total;
            total+=total;
            if(total>prev){
                break;
                //overflow
            }
            
        }
        
        return result==0?result:result+helper(dividend-prev,divisor);
        //time and space complexity O(logn)
    }
    
}
