//Validate Binary Search Tree

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
    public boolean isValidBST(TreeNode root) {
        
        if(root==null){
            return true;
        }
        
        Stack<TreeNode> stack=new Stack<TreeNode>();
        TreeNode pre=null;
        
        while(root!=null || !stack.isEmpty()){
            while(root!=null){
                stack.push(root);
                root=root.left;
            }
            root=stack.pop();
            if(pre!=null && root.val<=pre.val)
            {
                return false;
            }
            
            pre=root;
            root=root.right;
        } 
        return true;
    }
}