//Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp=new ListNode(0);
        temp.next=head;
        ListNode current=temp;
        if(head==null || head.next==null)
        {
        return head;
        }
        while(current.next!=null && current.next.next!=null)
        {
            
            if(current.next.val==current.next.next.val)
            {
                int x=current.next.val;
                while(current.next!=null && current.next.val==x)
                current.next=current.next.next;
            }
            else
            current=current.next;
        }
        return temp.next;
        
    }
}