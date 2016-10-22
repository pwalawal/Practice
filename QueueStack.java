/*
Implement the following operations of a queue using stacks.

push(x) -- Push element x to the back of queue.
pop() -- Removes the element from in front of queue.
peek() -- Get the front element.
empty() -- Return whether the queue is empty.
*/

class MyQueue {
    // Push element x to the back of queue.
    private Stack<Integer> stk=new Stack<Integer>();
    private Stack<Integer> temp=new Stack<Integer>();
    
    public void push(int x) {
        
        stk.push(x);
        
    }

    // Removes the element from in front of queue.
    public void pop() {
        
        if(temp.isEmpty())
        {
            while(!stk.isEmpty())
            {
                temp.push(stk.pop());
            }
        }
        temp.pop();
        
    }

    // Get the front element.
    public int peek() {
        
         if(temp.isEmpty())
        {
            while(!stk.isEmpty())
            {
                temp.push(stk.pop());
            }
        }
        int top=temp.peek();
       
        return top;
        
        
    }

    // Return whether the queue is empty.
    public boolean empty() {
        
        if(temp.isEmpty()&&stk.isEmpty())
        {
            return true;
        }
        return false;
        
    }
}