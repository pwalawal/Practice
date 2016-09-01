//You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        
        if(l1==null&&l2==null) 
        return null; 
        ListNode result=new ListNode(0);
        ListNode temp=result;
        int carry=0;
        int sum=0;
        while(l1!=null && l2!=null)
        {
            sum=(carry+l1.val+l2.val)%10;
            carry=(l1.val+l2.val+carry)/10;
            l1=l1.next;
            l2=l2.next;
            result.next=new ListNode(sum);
            result=result.next;
        }
        
        while(l1!=null)
        {
            sum=(l1.val+carry)%10;
            carry=(l1.val+carry)/10;;
            result.next=new ListNode(sum);
            result=result.next;
            l1=l1.next;
        }
        while(l2!=null)
        {
            sum=(l2.val+carry)%10;
            carry=(l2.val+carry)/10;
            result.next=new ListNode(sum);
            result=result.next;
            l2=l2.next;
        }
        
        if(carry>0)
        {
            result.next=new ListNode(carry);
        }
        
        return temp.next;
    }
}