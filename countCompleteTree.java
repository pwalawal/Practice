//Given a complete binary tree, count the number of nodes.

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
    public int countNodes(TreeNode root) {
        
        if(root==null)
        {
            return 0;
        }
        
        int left=getLeftNodes(root)+1;
        int right=getRightNodes(root)+1;
        
        if(left==right)
        {
            
            return (2<<left-1)-1;
        }
        else
        {
            return countNodes(root.left)+countNodes(root.right)+1;
        }
    }
    
    
    public int getLeftNodes(TreeNode node)
    {
        if(node==null)
        return 0;
        
        int count=0;
        while(node.left!=null)
        {
            count++;
            node=node.left;
        }
        return count;
        
    }
    
    public int getRightNodes(TreeNode node)
    {
        if(node==null)
        return 0;
        
        int count=0;
        while(node.right!=null)
        {
            count++;
            node=node.right;
        }
        return count;
        
    }
}