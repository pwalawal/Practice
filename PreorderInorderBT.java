//Given preorder and inorder traversal of a tree, construct the binary tree.

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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
        int pstart=0;
        int pend=preorder.length-1;
        int istart=0;
        int iend=inorder.length-1;
        
        return constructTree(preorder,pstart,pend,inorder,istart,iend);
        
    }
    
    public TreeNode constructTree(int[] preorder,int pstart,int pend, int[] inorder,int istart,int iend)
    {
        if(pstart>pend||istart>iend)
        {
            return null;
        }
        
        int root=preorder[pstart];
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
        
        p.left=constructTree(preorder,pstart+1,pstart+(k-istart),inorder,istart,k-1);
        p.right=constructTree(preorder,pstart+(k-istart)+1,pend,inorder,k+1,iend);
        
        return p;
        
    }
    
}