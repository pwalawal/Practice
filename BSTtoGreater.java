

//Convert BST to Greater Tree

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode convertBST(TreeNode root) {
        if(root==null){
            return null;
        }
        Stack<TreeNode> stack=new Stack<>();
        int sum=0;
        TreeNode temp=root;
        while(temp!=null || !stack.isEmpty() ){
            while(temp!=null){
                stack.push(temp);
                temp=temp.right;
            }
            temp=stack.pop();
            //int val=temp.val;
            
            temp.val=temp.val+sum;
            sum=temp.val;
            temp=temp.left;
        }
        return root;
        
    }
}