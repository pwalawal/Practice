/*
Given a list, rotate the list to the right by k places, where k is non-negative.
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
    public ListNode rotateRight(ListNode head, int k) {
             if (head==null|| k==0){
            return head;
        }
        
        int len=1;
        ListNode last=head;
        
        // calculate the lenght of given list
        while(last.next!=null){
            last=last.next;
            len++;
        }
        
        last.next=head;
        
        // Should considered the situtation that n larger than given list's length
        int n=len-k%len;
        ListNode preHead=last;
        
        // find the point which are previuse for our target head
        while(n>0){
            preHead=preHead.next;
            n--;
        }
        
        head=preHead.next;
        preHead.next=null;
        
        return head;

    }
}