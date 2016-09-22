

//Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).


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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> result=new ArrayList<>();
        
        
        if(root==null)
        {
            return result;
        }
        LinkedList<TreeNode> list=new LinkedList<TreeNode>();
        list.add(root);

        while (!list.isEmpty()) {
            List<Integer> set=new ArrayList<>();
            int len= list.size();
            for (int i = 0; i < len; i++) {
             
                TreeNode temp = list.remove();
                set.add(temp.val);
                if (temp.left != null) {
                    list.offer(temp.left);
                }
                if (temp.right != null) {
                    list.offer(temp.right);
                }
            }
            result.add(set);
        }
        return result;
    }
}