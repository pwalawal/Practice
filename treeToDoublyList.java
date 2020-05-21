/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {}

    public Node(int _val,Node _left,Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
};
*/
class Solution {
    public Node treeToDoublyList(Node root) {
        
        Node first=null;
        Node last=null;
        
        if(root==null){
            return first;
        }
        
        Stack<Node>stack=new Stack<>();
        
        while(root!=null || !stack.isEmpty()){
            //do inorder traversal 
            while(root!=null){
                stack.push(root);
                root=root.left;
            }
            root=stack.pop();
            if(first==null){
                //assign left most element as first
                first=root;
            }
            
            if(last!=null){
                //join left and right of previous and current node to create duble linked list
                last.right=root;
                root.left=last;
            }
            
            last=root;
            root=root.right;
        }
        
        last.right=first;
        first.left=last;
        
        return first;
    }
}
