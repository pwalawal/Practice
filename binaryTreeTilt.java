//Binary Tree Tilt

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
    
    int result=0;
    
    public int findTilt(TreeNode root) {
    
        calHeight(root);
        return result;
    }
    
    public int calHeight(TreeNode root){
        
        if(root ==null){
            return 0;
        }
        
        int left=calHeight(root.left);
        int right=calHeight(root.right);
        
        result=result+Math.abs(left-right);
        
        return left+right+root.val;
    }
}