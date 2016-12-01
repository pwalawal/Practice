//Unique Binary Search Trees II

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
    public List<TreeNode> generateTrees(int n) {
        if(n<=0){
            return new ArrayList<TreeNode>();
        }
        return genBST(1,n);
    }
    
    public List<TreeNode> genBST(int start,int end){
        List<TreeNode> result=new ArrayList<>();
        if(start>end){
            result.add(null);
            return result;
        }
        
        for(int i=start;i<=end;i++){
            List<TreeNode> leftNode=genBST(start,i-1);
            List<TreeNode> rightNode=genBST(i+1,end);
            
            for(TreeNode left:leftNode){
                for(TreeNode right:rightNode){
                    TreeNode head=new TreeNode(i);
                    head.left=left;
                    head.right=right;
                    result.add(head);
                }
            }
        }
        return result;
    }
    
}