/*
Given a singly linked list L: L0→L1→…→Ln-1→Ln,
reorder it to: L0→Ln→L1→Ln-1→L2→Ln-2→…

You must do this in-place without altering the nodes' values.
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
    public void reorderList(ListNode head) {
        
        if(head==null || head.next==null){
            return;
        }
        ListNode fast=head;
        ListNode slow=head;
        ListNode prev=null;
        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        
        prev.next=null;
        
        ListNode l2=reverse(slow);
        ListNode l1=head;
        
        merge(l1,l2);
        
    }
    
    public ListNode reverse(ListNode head){
        ListNode prev=null,next=null,cur=head;
        
        while(cur!=null){
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        
        return prev;
    }
    
    public void merge(ListNode l1,ListNode l2){
        while(l1!=null){
            ListNode n1=l1.next,n2=l2.next;
            l1.next=l2;
            
            if(n1==null){
                break;
            }
            
            l2.next=n1;
            l1=n1;
            l2=n2;
        }
    }
}