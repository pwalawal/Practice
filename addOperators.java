class Solution {
    
    public List<String> addOperators(String num, int target) {
        
        List<String> result=new ArrayList<>();
        if(num==null ||num.length()==0)return result;
        
        helper(num,target,result,"",0,0,0);
        return result; 
    }
    
    public void helper(String nums, int target,List<String> result,String exp,int start,long curEval,long pre ){
        
        if(start==nums.length()){
            if(curEval==target){
                result.add(exp);
            }
            return;
        }
        
        for(int i=start;i<nums.length();i++){
            if(i!=start && nums.charAt(start)=='0')break;
            // corner case: if current position is 0, we can only use it as a single digit number, should be 0
        // if it is not a single digit number with leading 0, it should be considered as an invalid number 
            long curNum=Long.parseLong(nums.substring(start,i+1));
            
            if(start==0){
                helper(nums,target,result,exp+curNum,i+1,curNum,curNum);
            }else{
                helper(nums,target,result,exp+"+"+curNum,i+1,curEval+curNum,curNum);
                helper(nums,target,result,exp+"-"+curNum,i+1,curEval-curNum,-curNum);
                helper(nums,target,result,exp+"*"+curNum,i+1,curEval-pre+curNum*pre,curNum*pre);
                // trick part: to calculate multiplication, we should subtract previous number, and then add current
            // multiplication result to the subtraction result 
            }
        }
        
    }
}
