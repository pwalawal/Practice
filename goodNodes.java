/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int count=0;
    public int goodNodes(TreeNode root) {
        
        if(root==null)return 0;
        dfs(root,root.val);
        return count;
        
    }
    
    public void dfs(TreeNode root, int val){
        if(root==null)return;
        
        if(root.val>=val)count++;
        
        val=Math.max(root.val,val);
        
        dfs(root.left,val);
        dfs(root.right,val);
        
    }
}
