//Nth digit

public class Solution {
    public int findNthDigit(int n) {
        
        int nums=1;
        long base=1;
        
        while(n>nums*base*9){
            n-=nums*base*9;
            nums++;
            base=base*10;
        }
        long value=base+(n-1)/nums;
        String s=Long.toString(value);
        return Character.getNumericValue(s.charAt((n-1)%nums));
        
    }
    
}