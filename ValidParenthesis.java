//Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

//The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.

public class Solution {
    public boolean isValid(String s) {
        
        int len=s.length();
        char arr[]=s.toCharArray();
        Stack<Character> st=new Stack<Character>();
        for(int i=0;i<len;i++)
        {
            if(arr[i]=='('||arr[i]=='['||arr[i]=='{')
            {
                st.push(arr[i]);
            }
            if(arr[i]==')'||arr[i]=='}'||arr[i]==']')
            {
                if(st.isEmpty())
                return false;
                
                char ch=st.pop();
                if(ch=='(' && arr[i]==')'||ch=='{'&& arr[i]=='}'||ch=='['&& arr[i]==']')
                continue;
                else return false;
                
                
            }
            
            
            
        }
        if(!st.isEmpty())
        return false;
        else return true;
        
    }
}