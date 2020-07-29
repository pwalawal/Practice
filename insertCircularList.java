/*
// Definition for a Node.
class Node {
    public int val;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _next) {
        val = _val;
        next = _next;
    }
};
*/

class Solution {
    public Node insert(Node head, int insertVal) {
        
        
        if(head==null){
            head=new Node(insertVal);
            head.next=head;
            return head;
        }
        Node max=head;
        while(max.val<=max.next.val && max.next!=head){
            max=max.next;
        }
        Node min=max.next;
        
        if(insertVal<=min.val || insertVal>=max.val){
            Node node=new Node(insertVal,min);
            max.next=node;
            return head;
        }
        Node cur=min;
        
        while(cur.next.val<insertVal){
            cur=cur.next;
        }
        Node node=new Node(insertVal);
        node.next=cur.next;
        cur.next=node;
        return node;
        
        
        
    }
}
