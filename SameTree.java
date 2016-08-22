//Given two binary trees, write a function to check if they are equal or not.
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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        if(p==null && q==null)
        return true;
        
        while(p!=null && q!=null)
        {
            return(p.val==q.val && isSameTree(p.left,q.left) && isSameTree(p.right,q.right));
        }
        return false;
        
    }
}