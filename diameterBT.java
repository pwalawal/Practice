//diameter of Binary tree

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
    int max=0;
    public int diameterOfBinaryTree(TreeNode root) {
        
        calHeight(root);
        return max;
        
    }
    
    public int calHeight(TreeNode root) {
        
        if(root==null){
            return 0;
        }
        
        int left=calHeight(root.left);
        int right=calHeight(root.right);
        
        max=Math.max(max,left+right);
        return 1+Math.max(left,right);
    }
    
}