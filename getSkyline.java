class Solution {
    public List<List<Integer>> getSkyline(int[][] buildings) {
        
        
        List<List<Integer>>result=new ArrayList<>();
        List<int[]>height=new ArrayList<>();
        
        for(int b[]:buildings){
            // start point has negative height value
            height.add(new int[]{b[0],-b[2]});
            // end point has normal height value
            height.add(new int[]{b[1],b[2]});
        }
        Collections.sort(height,(a,b)->(a[0]!=b[0]?a[0]-b[0]:a[1]-b[1]));
        
        PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)->(b-a));
        
        
        
        pq.offer(0);
        
        int prev=0;
        
        for(int h[]:height){
            if(h[1]<0){
                pq.offer(-h[1]);
            }else{
                pq.remove(h[1]);
            }
            
            int cur=pq.peek();
            
            if(cur!=prev){
                result.add(Arrays.asList(new Integer[]{h[0],cur}));
                prev=cur;
            }
        }
        return result;
        
    }
}
