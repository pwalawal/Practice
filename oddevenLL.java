//Odd Even Linked List

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode oddEvenList(ListNode head) {
        
        if(head==null)
        {
            return head;
        }
        
        ListNode newHead=head;
        ListNode odd=head;
        ListNode even=head.next;
        ListNode connect=even;
        
        while(even!=null && even.next!=null)
        {
            odd.next=even.next;
            odd=odd.next;
            
            even.next=odd.next;
            even=even.next;
        }
        odd.next=connect;
        
        return newHead;
        
    }
}