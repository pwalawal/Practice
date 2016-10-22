
//Given a binary search tree, write a function kthSmallest to find the kth smallest element in it.

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
    private int result;
    private int counter=0;
    public int kthSmallest(TreeNode root, int k) {
        
        if(root==null)
        {
            return 0;
        }
        
        traverse(root,k);
        return result;
      
    }
    
    public void traverse(TreeNode root, int k){
        
        if(root==null || counter>k)
        return;
        
        traverse(root.left,k);
        
        counter++;
        if(counter==k)
        {
            result=root.val;
        }
        
        traverse(root.right,k);
        
        
        
    }
    
}