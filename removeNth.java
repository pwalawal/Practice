//Given a linked list, remove the nth node from the end of list and return its head.

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null)
        {
            return null;
        }
        ListNode pt1=head;
        ListNode pt2=head;
        int count=0;
        while(count<n)
        {
            pt1=pt1.next;
            count++;
        }
        if(pt1==null)
        {
            head=head.next;
            return head;
        }
        while(pt1.next!=null)
        {
            pt1=pt1.next;
            pt2=pt2.next;
        }
        
        
        pt2.next=pt2.next.next;
        
        return head;
        
    }
}