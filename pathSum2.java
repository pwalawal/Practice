/*
Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given sum.
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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        
        List<List<Integer>> result=new ArrayList<>();
        if(root==null)
        {
            return result;
        }
        
        List<Integer> al=new ArrayList<Integer>();
        al.add(root.val);
        dfs(root, sum-root.val, al,result);
        return result;
    }
    
    public void dfs(TreeNode node, int sum, List<Integer> al,List<List<Integer>> result)
    {
        if(node.left==null && node.right==null && sum==0)
        {
            List<Integer> temp=new ArrayList<>(al);
            result.add(temp);
            
        }
        
        if(node.left!=null)
        {
            al.add(node.left.val);
            dfs(node.left,sum-node.left.val,al,result);
            al.remove(al.size()-1);
        }
        
        if(node.right!=null)
        {
            al.add(node.right.val);
            dfs(node.right,sum-node.right.val,al,result);
            al.remove(al.size()-1);
        }
    }
}