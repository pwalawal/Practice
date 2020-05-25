class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {
        
        Stack<Integer>stack=new Stack<>();
        //store id
        int prev=0;
        
        int result[]=new int[n];
        
        for(String log:logs){
        
            String[] str=log.split(":");
            int id=Integer.parseInt(str[0]);
            int cur=Integer.parseInt(str[2]);
            
            if(str[1].equals("start")){
                if(!stack.isEmpty()){
                    result[stack.peek()]+=cur-prev;
                }
                stack.push(id);
                prev=cur;
            }else{
                result[stack.pop()]+=cur-prev+1;
                //str[2] is end of current interval, belong to current interval. That's why we have +1 here
                prev=cur+1;
            }
            
        }
        return result;
        
    }
}
