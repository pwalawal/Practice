//Add Two Numbers II

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
        
        Stack<Integer> s1=new Stack<Integer>();
        Stack<Integer> s2=new Stack<Integer>();
        
        while(l1!=null){
            s1.push(l1.val);
            l1=l1.next;
        }
        
        while(l2!=null){
            s2.push(l2.val);
            l2=l2.next;
        }
        
        int sum=0;
        int carry=0;
        ListNode result=new ListNode(0);
        
        
        while(!s1.empty()||!s2.empty()){
            
            if(!s1.empty()){
                sum+=s1.pop();
            }
            if(!s2.empty()){
                sum+=s2.pop();
            }
            result.val=sum%10;
            ListNode temp=new ListNode(sum/10);
            temp.next=result;
            result=temp;
            sum/=10;
        }
        
        
        return result.val==0?result.next:result;
    }
}