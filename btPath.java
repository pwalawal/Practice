//Given a binary tree, return all root-to-leaf paths.

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
    
    List<String> result = new ArrayList<String>();
    StringBuilder sb = new StringBuilder();
    public List<String> binaryTreePaths(TreeNode root) {
        
   
    
    
    
        if(root == null)
            return result;
        
        int cntr = sb.length();
        if(root.left == null && root.right == null)
        {
            sb.append(root.val);
            result.add(sb.toString());
            sb.delete(cntr,sb.length());
            
        }    
        if(root.left != null)
        {
            sb.append(root.val);
            sb.append("->");
            binaryTreePaths(root.left);
            sb.delete(cntr,sb.length());
        }
        if(root.right != null)
        {
            sb.append(root.val);
            sb.append("->");
            binaryTreePaths(root.right);
            sb.delete(cntr,sb.length());         
        }
        return result;
    }

        
        
        
    
}