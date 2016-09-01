/*
Given a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.

You should preserve the original relative order of the nodes in each of the two partitions.
*/


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode partition(ListNode head, int x) {
        
        ListNode temp1=new ListNode(0);//for less than x node
        ListNode temp2=new ListNode(0);//for greater than x node
        ListNode result=temp1;
        ListNode tracker=temp2;
        
        while(head!=null)
        {
            if(head.val<x)
            {
                temp1.next=new ListNode(head.val);
                temp1=temp1.next;
            }
            else
            {
                temp2.next=new ListNode(head.val);
                temp2=temp2.next;
                
            }
            
            head=head.next;
        }
        
        temp1.next=tracker.next;
        return result.next;
    }
}