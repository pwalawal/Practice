/*
Min Stack
Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
getMin() -- Retrieve the minimum element in the stack
*/


public class MinStack {

    /** initialize your data structure here. */
    private Stack<Integer> stk;
    private Stack<Integer> minStk;
    public MinStack() {
        
        stk=new Stack<Integer>();
        minStk=new Stack<Integer>();
        
    }
    
    public void push(int x) {
        
        stk.push(x);
        if(minStk.isEmpty()||x<=minStk.peek())
        {
            minStk.push(x);
        }
      
       
    }
    
    public void pop() {
        
        if(stk.empty())
        {
            return;
        }
        if(stk.peek().equals(minStk.peek()))
        {
            minStk.pop();
        }
        stk.pop();
    }
    
    public int top() {
        
        return stk.peek();
        
    }
    
    public int getMin() {
        
        return minStk.peek();
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */