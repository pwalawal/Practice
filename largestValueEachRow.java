LeetCode
Problems 
Mock 
Contest
Articles
Discuss
 • 
  Store
Book
 Premium
pwalawal
Notes Auto Saved.
|||

Type here...(Markdown is enabled)
​
 0 0
 
Add to List
515. Find Largest Value in Each Tree Row
DescriptionHintsSubmissionsSolutions
Total Accepted: 14626
Total Submissions: 26840
Difficulty: Medium
Contributors:
love_Fawn
You need to find the largest value in each row of a binary tree.

Example:
Input: 

          1
         / \
        3   2
       / \   \  
      5   3   9 

Output: [1, 3, 9]
Subscribe to see which companies asked this question.

Show Tags
Have you met this question in a real interview? Yes  No
Discuss  Pick One   Editorial Solution
 


1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
28
29
30
31
32
33
34
35
36
37
38
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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> list=new LinkedList<>();
        if(root==null){
            return list;
        }
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        queue.add(root);
        
        while(!queue.isEmpty()){
            int size=queue.size();
            int max=Integer.MIN_VALUE;
            for(int i=0;i<size;i++){
                TreeNode cur=queue.poll();
                max=Math.max(max,cur.val);
                if(cur.left!=null){
                    queue.offer(cur.left);
                }
                if(cur.right!=null){
                    queue.offer(cur.right);
                }
                
            }
            list.add(max);
        }
        return list;
    }
}
Custom Testcase  
 Contribute Testcase
Run CodeSubmit Solution
Submission Result: Accepted More Details 

Next challenges: (H) Freedom Trail(M) 01 Matrix(M) Friend Circles
Share your acceptance!

14
Frequently Asked Questions | Terms of Service



Copyright © 2017 LeetCode

  Send Feedback