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
    public boolean isCompleteTree(TreeNode root) {
        
        Queue<TreeNode>queue=new LinkedList<>();
        if(root==null){
            return true;
        }
        boolean seenEmpty=false;
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode temp=queue.poll();
            
            if(temp==null){
                seenEmpty=true;
            }else{
                if(seenEmpty)return false;
                queue.add(temp.left);
                queue.add(temp.right);
            }
        }
        return true;
        
    }
}
