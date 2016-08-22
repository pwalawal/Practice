//Given a singly linked list, determine if it is a palindrome.

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
        
        if(head == null || head.next==null)
        return true;
 
    //find list center
    ListNode fast = head;
    ListNode slow = head;
 
    while(fast.next!=null && fast.next.next!=null){
        fast = fast.next.next;
        slow = slow.next;
    }
 
    ListNode secondHead = slow.next;
    slow.next = null;
 
    //reverse second part of the list
    ListNode current = secondHead;
    ListNode prev = null;
    ListNode next=null;
 
    while(current!=null){
        next=current.next;
        current.next=prev;
        prev=current;
        current=next;
    }
 
    secondHead.next = null;
 
    //compare two sublists now
    ListNode p = prev;
    ListNode q = head;
    while(p!=null){
        if(p.val != q.val)
            return false;
 
        p = p.next;
        q = q.next;
 
    }
 
    return true;
        
        
    }
}