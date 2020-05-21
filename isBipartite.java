class Solution {
    
    
    public boolean isBipartite(int[][] graph) {
       
        int len=graph.length;
        int colors[]=new int[len];
        
        for(int i=0;i<len;i++){
            if(colors[i]==0){
                Queue<Integer>queue=new LinkedList<>();
                
                queue.add(i);
                colors[i]=1;
                
                while(!queue.isEmpty()){
                    
                    int cur=queue.poll();
                    for(int adj:graph[cur]){
                        if(colors[cur]==colors[adj]){
                            //if both color of same color then they are in same subset
                            return false;
                        }
                        else if(colors[adj]==0){
                            colors[adj]=-colors[cur];
                            queue.add(adj);
                        }
                        
                    }
                    
                }
                
            }
        }
        return true;
           
    }
    
}
