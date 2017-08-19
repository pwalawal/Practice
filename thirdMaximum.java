//Third Maximum Number

class Solution {
    public int thirdMax(int[] nums) {
        PriorityQueue<Integer>queue=new PriorityQueue<>();
        Set<Integer>set=new HashSet<>();
        for(int i:nums){
            if(!set.contains(i)){
                set.add(i);
                queue.offer(i);
                
                if(queue.size()>3){
                    queue.poll();
                }
            }
        }
        
        
        if(queue.size()<3){
            while(queue.size()>1){
                queue.poll();
            }
        }
        
        return queue.peek();
    }
}