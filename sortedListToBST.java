//Given a singly linked list where elements are sorted in ascending order, convert it to a height balanced BST.

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
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
    
    ListNode h;
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null)
        {
            return null;
        }
        int len=0;
        ListNode temp=head;
        while(temp!=null)
        {
            temp=temp.next;
            len++;
        }
        h=head;
        return sortedListToBST(head,0,len-1);
        
        
        
    }
    
    
    
    public TreeNode sortedListToBST(ListNode head, int start, int end)
    {
        if(start>end)
        {
            return null;
        }
        
        int mid=(start+end)/2;
        TreeNode left=sortedListToBST(h,start,mid-1);
        TreeNode root=new TreeNode(h.val);
        h=h.next;
        TreeNode right=sortedListToBST(h,mid+1,end);
        
        root.left=left;
        root.right=right;
        
        return root;
        
        
    }
}

