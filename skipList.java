class Node {
    int val;
    Node next, down;
    public Node(int val, Node next, Node down){
        this.val=val;
        this.next=next;
        this.down=down;
    }
}

class Skiplist {

    Node head;
    Random rand;
    public Skiplist() {
        head=new Node(-1,null,null);
        rand=new Random();
    }
    
    public boolean search(int target) {
        
        boolean found=false;
        Node cur=head;
         while(cur!=null){
            while(cur.next!=null && cur.next.val<target){
                cur=cur.next;
            }
             
            if(cur.next!=null && cur.next.val==target)return true;
            cur=cur.down; 
        }
        return false;
        
    }
    
    public void add(int num) {
        boolean insert=true;
        Node cur=head;
        Stack<Node>stack=new Stack<>();
        
        while(cur!=null){
            while(cur.next!=null && cur.next.val<num){
                cur=cur.next;
            }
            stack.push(cur);
            cur=cur.down;
            
        }
        Node down=null;
        while(insert && !stack.isEmpty()){
            cur=stack.pop();
            cur.next=new Node(num,cur.next,down);
            down=cur.next;
            insert=rand.nextDouble()<0.5;
        }
        
        if(insert){
            head=new Node(-1,null,head);
        }
        
    }
    
    public boolean erase(int num) {
        boolean found=false;
        Node cur=head;
         while(cur!=null){
            while(cur.next!=null && cur.next.val<num){
                cur=cur.next;
            }
             
            if(cur.next!=null && cur.next.val==num){
                found=true;
                cur.next=cur.next.next;
            }
            cur=cur.down; 
        }
        return found;
    }
}

/**
 * Your Skiplist object will be instantiated and called as such:
 * Skiplist obj = new Skiplist();
 * boolean param_1 = obj.search(target);
 * obj.add(num);
 * boolean param_3 = obj.erase(num);
 */
