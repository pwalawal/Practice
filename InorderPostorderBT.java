//Given inorder and postorder traversal of a tree, construct the binary tree.

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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        
        int pstart=0;
        int pend=postorder.length-1;
        int instart=0;
        int inend=inorder.length-1;
        
        return constructTree(inorder,instart,inend,postorder,pstart,pend);
        
    }
    
    public TreeNode constructTree(int[] inorder,int instart,int inend, int[] postorder, int pstart, int pend)
    {
        if(pstart>pend||instart>inend)
        {
            return null;
        }
        
        int root=postorder[pend];
        TreeNode p=new TreeNode(root);
        
        int k=0;
        for(int i=0;i<inorder.length;i++)
        {
            if(root==inorder[i])
            {
                k=i;
                break;
            }
        }
        
        p.left=constructTree(inorder,instart,k-1,postorder,pstart,pstart+k-instart-1);
        p.right=constructTree(inorder,k+1,inend,postorder,pstart+k-instart,pend-1);
        
        return p;
        
        
        
    }
}