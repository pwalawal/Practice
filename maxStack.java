class Node{
    int val;
    Node prev;
    Node next;
    
    Node(int val){
        this.val=val;
    }
}

class DLL{
    Node head;
    Node tail;
    
    DLL(){
        head=new Node(-1);
        tail=new Node(-1);
        head.next=tail;
        tail.prev=head;
    }
    
    void insertAtTail(Node node){
        
        Node before=tail.prev;
        before.next=node;
        node.next=tail;
        node.prev=before;
        tail.prev=node;
     
    }
    
    void remove (Node node){
        Node before=node.prev;
        Node after=node.next;
        before.next=after;
        after.prev=before;
    }
    
}
class MaxStack {
    
    DLL dll;
    TreeMap<Integer,List<Node>>map=new TreeMap<>();

    /** initialize your data structure here. */
    public MaxStack() {
        dll=new DLL();
        
    }
    
    public void push(int x) {
        Node node=new Node(x);
        dll.insertAtTail(node);
        map.putIfAbsent(x,new ArrayList<>());
        map.get(x).add(node);
    }
    
    public int pop() {
        
        int val=dll.tail.prev.val;
        dll.remove(dll.tail.prev);
        int size=map.get(val).size();
        if(size==1) map.remove(val);
        else{
            map.get(val).remove(size-1);
        }
        return val;
    }
    
    public int top() {
        return dll.tail.prev.val;
    }
    
    public int peekMax() {
        return map.lastKey();
    }
    
    public int popMax() {
        int max=map.lastKey();
        int size=map.get(max).size();
        Node node=map.get(max).remove(size-1);
        dll.remove(node);
        if(size==1)map.remove(max);
        return max;
    }
}

/**
 * Your MaxStack object will be instantiated and called as such:
 * MaxStack obj = new MaxStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.peekMax();
 * int param_5 = obj.popMax();
 */
