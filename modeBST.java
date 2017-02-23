// Find Mode in Binary Search Tree

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
    
    HashMap<Integer,Integer> map=new HashMap<>();
    int max=0;
    
    public int[] findMode(TreeNode root) {
        if(root==null){
            return new int[0];
        }
        inorder(root);
        List<Integer> list=new ArrayList<Integer>();
        for(int key:map.keySet()){
            if(map.get(key)==max){
                list.add(key);
            }
        }
        
        int result[]=new int[list.size()];
        for(int i=0;i<list.size();i++){
            result[i]=list.get(i);
        }
        return result;
        
        
    }
    
    public void inorder(TreeNode root){
        if(root.left!=null){
            inorder(root.left);
        }
        map.put(root.val,map.getOrDefault(root.val,0)+1);
        max=Math.max(max,map.get(root.val));
        
        if(root.right!=null){
            inorder(root.right);
        }
    }
}