class Solution {
    public int minReorder(int n, int[][] connections) {
        
        /*
Make the whole graph bidirectional with fake edges.
Start bfs with the root as 0.
count the edge which is not fake and going away from 0 OR going away from nodes connected to 0.
return count
        */
        
        HashSet<String> set=new HashSet<>();
        Map<Integer,HashSet<Integer>>map=new HashMap<>();
        
        int result=0;
        
        for(int[] c:connections){
            set.add(c[0]+","+c[1]);
            map.putIfAbsent(c[0],new HashSet<Integer>());
            map.putIfAbsent(c[1],new HashSet<Integer>());
            
            map.get(c[0]).add(c[1]);
            map.get(c[1]).add(c[0]);
        }
        
        Queue<Integer>queue=new LinkedList<>();
        
        boolean[]visited=new boolean[n];
        queue.add(0);
        visited[0]=true;
        
        while(!queue.isEmpty()){
            
            int cur=queue.poll();
            if(!map.containsKey(cur))continue;
            for(int next:map.get(cur)){
                
                if(visited[next])continue;
                
                visited[next]=true;
                
                if(!set.contains(next+","+cur))result++;
                queue.add(next);
                
            }
            
        }
        return result;
        
        
    }
}
