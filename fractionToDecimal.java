class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        
        StringBuilder result=new StringBuilder();
        String sign=(numerator<0==denominator<0 || numerator==0)?"":"-";
        result.append(sign);
        
        long num=Math.abs((long)numerator);
        long den=Math.abs((long)denominator);
        
        result.append(num/den);
        
        long rem=num%den;
        if(rem==0){
            return result.toString();
        }
        
        result.append('.');
        Map<Long,Integer>map=new HashMap<>();
        //store numerator as repetiton of numerator could be recurring
        
        while(rem!=0){
            if(!map.containsKey(rem)){
                map.put(rem,result.length());
                //save the length of result to (num*10)/den starts from this idx
            }
            else{
                int idx=map.get(rem);
                return result.substring(0,idx)+"("+result.substring(idx)+")";
            }
            
            rem=rem*10;
            result.append(rem/den);
            rem=rem%den;
        }
        
        return result.toString();
        
    }
}
