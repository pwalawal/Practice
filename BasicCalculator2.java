class Solution {
    public int calculate(String s) {
        
        s=s.trim();
        int result=0;
        Stack<Integer>stack=new Stack<>();
        int sum=0;
        char sign='+';
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
               sum=sum*10+s.charAt(i)-'0';
            }if(!Character.isDigit(s.charAt(i))&&' '!=s.charAt(i)|| i==s.length()-1){
                if(sign=='+'){
                    stack.push(sum);
                }if(sign=='-'){
                    stack.push(-sum);
                }if(sign=='*'){
                    stack.push(stack.pop()*sum);
                }if(sign=='/'){
                    stack.push(stack.pop()/sum);
                }
                sign=s.charAt(i);
                sum=0;  
            } 
                
        }
        
        
        for(int num:stack){
            result+=num;
        }
        return result;
        
    }
}
