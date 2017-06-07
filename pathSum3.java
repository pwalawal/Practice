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
    public int pathSum(TreeNode root, int sum) {
        
        if(root==null){
            return 0;
        }
        int count=pathFromRoot(root, sum);
        return count+pathSum(root.left,sum)+pathSum(root.right,sum);
        
    }
    
    public int pathFromRoot(TreeNode root, int sum){
        
        if(root==null){
            return 0;
        }
        
        int result=0;
        if(sum==root.val){
            result=1;
        }
        return result + pathFromRoot(root.left,sum-root.val)+pathFromRoot(root.right,sum-root.val);
        
    }
}