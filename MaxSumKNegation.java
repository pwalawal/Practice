class Solution {
    public int largestSumAfterKNegations(int[] A, int K) {
        
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        
        for(int a:A){
            pq.add(a);
        }
        
        while(K-->0){
            pq.add(-pq.poll());
        }
        
        int sum=0;
        
        while(!pq.isEmpty()){
            sum+=pq.poll();
        }
        return sum;
    }
}
