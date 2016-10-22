/*
Implement the following operations of a stack using queues.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
empty() -- Return whether the stack is empty.
*/


class MyStack {
    // Push element x onto stack.
    
    private Queue<Integer> que=new LinkedList<>();
    public void push(int x) {
        que.offer(x);
        
    }

    // Removes the element on top of the stack.
    public void pop() {
        for(int i=1;i<que.size();i++)
        {
            int temp=que.poll();
            que.offer(temp);
        }
        
        que.poll();
        
    }

    // Get the top element.
    public int top() {
        for(int i=1;i<que.size();i++)
        {
            int temp=que.poll();
            que.offer(temp);
        }
        int top=que.peek();
        int temp=que.poll();
        que.offer(temp);
        return top;
        
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return que.isEmpty();
    }
}