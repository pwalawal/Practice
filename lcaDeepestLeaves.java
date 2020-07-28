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
    HashMap<TreeNode,Integer>map=new HashMap<>();
    //use map for O(n) coplexity, else it will calculate height for each node
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        
        if(root==null){
            return null;
        }
        int left=depth(root.left);
        int right=depth(root.right);
        
        if(left==right){
            return root;
        }else if(left<right){
            return lcaDeepestLeaves(root.right);
        }else{
            return lcaDeepestLeaves(root.left);
        }
    }
    
    public int depth(TreeNode root){
        if(root==null){
            return 0;
        }
        if(!map.containsKey(root)){
            map.put(root,1+Math.max(depth(root.left),depth(root.right)));
        }
        return map.get(root);
    }
}
