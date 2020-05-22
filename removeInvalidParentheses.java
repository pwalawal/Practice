class Solution {
    public List<String> removeInvalidParentheses(String s) {
        
        List<String> list=new ArrayList<>();
        
        if(s==null){
            return list;
        }
        Queue<String>queue=new LinkedList<>();
        Set<String>set=new HashSet<>();
        
        queue.add(s);
        set.add(s);
        
        boolean found=false;
        
        while(!queue.isEmpty()){
            
            s=queue.poll();
            
            if(isValid(s)){
                list.add(s);
                found=true;
            }
            
            if(found==true)continue;
            /*this ensures once we've found a valid parentheses pattern, we don't do any further bfs using items pending in the queue since any further bfs would only yield strings of smaller length. However the items already in queue need to be processed since there could be other solutions of the same length.
great solution.*/
            
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)!='(' && s.charAt(i)!=')')continue;
                String t=s.substring(0,i)+s.substring(i+1);
                
                if(!set.contains(t)){
                    queue.add(t);
                    set.add(t);
                }
                
            }
        }
        return list;
        
    }
    
    public boolean isValid(String s){
        
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                count++;
            }
            if(s.charAt(i)==')'&& count--==0){
                return false;
            }
        }
        
        return count==0;
        
    }
    // n*(2^n)
    
}
