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
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        
        if(root==null){
            return null;
        }
        
        int left=depth(root.left);
        int right=depth(root.right);
        
        if(left<right){
            return subtreeWithAllDeepest(root.right);
        }else if(right<left){
            return subtreeWithAllDeepest(root.left);
        }else return root;
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
