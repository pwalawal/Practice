//Merge k Sorted Lists

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        
        if(lists==null||lists.length==0){
            return null;
        }
        
        PriorityQueue<ListNode> queue=new PriorityQueue<ListNode>(lists.length,new Comparator<ListNode>(){
            @Override
            public int compare(ListNode p1,ListNode p2){
                if(p1.val<p2.val){
                    return -1;
                }
                else if(p1.val==p2.val){
                    return 0;
                }
                else{
                    return 1;
                }
            }
            }
            );
            
            ListNode newHead=new ListNode(0);
            ListNode temp=newHead;
            
            for(ListNode node:lists){
                if(node!=null){
                    queue.add(node);
                }
            }
            
            while(!queue.isEmpty()){
                temp.next=queue.poll();
                temp=temp.next;
                
                if(temp.next!=null){
                    queue.add(temp.next);
                }
            }
            return newHead.next;
            
        
        
    }
}