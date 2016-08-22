//Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

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
    public boolean isSymmetric(TreeNode root) {
        
        if(root==null)
        {
            return true;
        }
        
        return isSymmetric(root.left,root.right);
        
    }
    public boolean isSymmetric(TreeNode l,TreeNode r)
    {
        if(l==null && r==null)
        return true;
        
        while(l!=null &&r !=null)
        {
            return(l.val==r.val && isSymmetric(l.left,r.right) && isSymmetric(l.right,r.left));
        }
        return false;
        
    }
}