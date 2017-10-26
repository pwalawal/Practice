//String from BT

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public String tree2str(TreeNode t) {
        
        if(t==null){
            return "";
        }
        StringBuilder sb=new StringBuilder();
        preorder(t,sb);
        return sb.toString();
        
    }
    
    public void preorder(TreeNode root,StringBuilder sb){
        if(root==null){
            return;
        }
        
        sb.append(root.val);
        
        if(root.left!=null||root.right!=null){
            sb.append("(");
            preorder(root.left,sb);
            sb.append(")");
        }
        if(root.right!=null){
            
            sb.append("(");
            preorder(root.right,sb);
            sb.append(")");
            
        }
    }
}