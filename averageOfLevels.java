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
    public List<Double> averageOfLevels(TreeNode root) {
       
        
        List<Double>list=new ArrayList<>();
        
        if(root==null){
            return list;
        }
        
        int level=1;
        Deque<TreeNode>queue=new ArrayDeque<>(); 
        
        queue.offer(root);
        
        while(!queue.isEmpty()){
            int size=queue.size();
            double sum=0;
            for(int i=0;i<size;i++){
                
                root=queue.poll();
                sum+=root.val;
                
                if(root.left!=null){
                    queue.offer(root.left);
                }
                if(root.right!=null){
                    queue.offer(root.right);
                }
                
            }
            list.add(sum/size);
        }
        return list;
        
    }
}
