/*
Sum Root to Leaf Numbers
Given a binary tree containing digits from 0-9 only, each root-to-leaf path could represent a number.
*/


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
    public int sumNumbers(TreeNode root) {
        
        if(root==null)
        {
            return 0;
        }
        int result=dfs(root,0,0);
        return result;
    }
    
    
    public int dfs(TreeNode root, int number,int sum)
    {
         if(root==null)
         {
             return sum;
         }
         number=number*10+root.val;
         
         if(root.left==null && root.right==null)
         {
             sum=sum+number;
             return sum;
         }
         
         int sum1=dfs(root.left,number,sum);
         int sum2=dfs(root.right,number,sum);

         sum=sum1+sum2;
         return sum;
        
    }
}