//Intersection of Two Linked Lists

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        ListNode p1=headA;
        ListNode p2=headB;
        int count1=0,count2=0;
        
        if(headA==null||headB==null)
        {
            return null;
        }
        
        while(p1!=null)
        {
            count1++;
            p1=p1.next;
        }
        while(p2!=null)
        {
            count2++;
            p2=p2.next;
        }
        
        p1=headA;
        p2=headB;
        
        int diff=0;
        
        if(count1>count2)
        {
            diff=count1-count2;
            while(diff>0)
            {
                p1=p1.next;
                diff--;
            }
        }
        else
        {
            diff=count2-count1;
            while(diff>0)
            {
                p2=p2.next;
                diff--;
            }
        }
        
        while(p1!=null && p2!=null)
        {
            if(p1==p2)
            {
                return p1;
            }
            else
            {
                p1=p1.next;
                p2=p2.next;
            }
        }
        
        return null;
        
        
    }
}