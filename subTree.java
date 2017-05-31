/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        Stack <TreeNode>stack=new Stack<TreeNode>();
        stack.push(s);
        while(!stack.isEmpty()){
            TreeNode temp=stack.pop();
            if(isSameTree(temp,t)){
                return true;
            }
            if(temp.right!=null){
                stack.push(temp.right);
            }
            if(temp.left!=null){
                stack.push(temp.left);
            }
        }
        return false;
    }
    
    public boolean isSameTree(TreeNode s,TreeNode t){
        if(s==null && t==null){
            return true;
        }
        if(s==null||t==null||s.val!=t.val){
            return false;
        }
        else{
            return isSameTree(s.left,t.left) && isSameTree(s.right,t.right);
        }
    
    }
}