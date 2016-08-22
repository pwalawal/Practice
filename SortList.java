//Sort a linked list in O(n log n) time using constant space complexity.
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode sortList(ListNode head) {
        
        if (head == null || head.next == null)
			return head;
 
		// count total number of elements
		int count = 0;
		ListNode p = head;
		while (p != null) {
			count++;
			p = p.next;
		}
 
		// break up to two list
		int middle = count / 2;
 
		ListNode l = head, r = null;
		ListNode temp = head;
		int countHalf = 0;
		while (temp != null) {
			countHalf++;
			
 
			if (countHalf == middle) {
			    r=temp.next;
				temp.next = null;
				
			}
			temp = temp.next;
		}
 
		// now we have two parts l and r, recursively sort them
		l = sortList(l);
		r = sortList(r);
 
		// merge together
		ListNode merged = merge(l, r);
 
		return merged;
        
    }
    
    public ListNode merge(ListNode l, ListNode r){
        
        ListNode result= new ListNode(-1);
        ListNode cur = result;

        while(l!=null || r!=null){
            if(l==null){
                cur.next = r;
                break;
            }else if(r==null){
                cur.next = l;
                break;
            }else{
                if(l.val <= r.val){
                    cur.next = l;
                    l = l.next;
                    cur = cur.next;
                }else {
                    cur.next = r;
                    r = r.next;
                    cur = cur.next;
                }
            }
        }
        return result.next;
    }
}