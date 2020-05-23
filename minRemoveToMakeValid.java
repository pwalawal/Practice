class Solution {
    public String minRemoveToMakeValid(String s) {
       
        StringBuilder sb=new StringBuilder();
        Stack<Integer>stack=new Stack<>();
        boolean []isValid=new boolean[s.length()];
        //boolean keeps track if the char is valid char/parenthesies or not
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                stack.push(i);
            }else if(s.charAt(i)==')'){
                if(stack.isEmpty()){
                    isValid[i]=false;
                }else{
                    isValid[i]=true;
                    isValid[stack.pop()]=true;
                }
            }else{
                isValid[i]=true;
            }
        }
        
        for(int i=0;i<s.length();i++){
            if(isValid[i]){
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
   
}
