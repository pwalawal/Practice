/*
Reverse a linked list from position m to n. Do it in-place and in one-pass.

For example:
Given 1->2->3->4->5->NULL, m = 2 and n = 4,

return 1->4->3->2->5->NULL.
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
    public ListNode reverseBetween(ListNode head, int m, int n) {
        
        if(m==n)
        {
            return head;
        }
    
        //Listnode to track (m-1)th node
        ListNode temp=new ListNode(0);
        temp.next=head;
        head=temp;
        //iterating till temp reaches (m-10)th node
        for(int i=0;i<m-1;i++)
        {
            if(head==null)
            {
                return head;
            }
            head=head.next;
        }
     
       
       ListNode prev=head.next;//mth node
       ListNode mNode=prev;
       ListNode cur=prev.next;
       
       for(int i=m;i<n;i++)
       {
           if(cur==null)
           return null;
           
           ListNode p=cur.next;
           cur.next=prev;
           prev=cur;
           cur=p;
       }
       mNode.next=cur;
       head.next=prev;
       return temp.next; 
        
    }
}