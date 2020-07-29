class Solution {
    public int minKnightMoves(int x, int y) {
        
        HashMap<Integer,HashMap<Integer,Integer>>map=new HashMap<>();
        //store x as key an y as key of inner hashmap and distance as value
        
        Queue<int[]>queue=new LinkedList<>();
        queue.add(new int[]{0,0});
        HashMap<Integer,Integer>temp=new HashMap<>();
        temp.put(0,0);
        
        map.put(0,temp);
        int dirs[][]=new int[][]{{-2,-1},{-1,-2},{1,2},{2,1},{2,-1},{1,-2},{-2,1},{-1,2}};
        while(!queue.isEmpty()){
            int[]cur=queue.poll();
            if(cur[0]==x && cur[1]==y){
                return map.get(cur[0]).get(cur[1]);
            }
            
            for(int dir[]:dirs){
                int newX=cur[0]+dir[0];
                int newY=cur[1]+dir[1];
                int dist=map.get(cur[0]).get(cur[1])+1;
                if(map.containsKey(newX)&&map.get(newX).containsKey(newY))continue;
                
                if(!map.containsKey(newX)){
                    map.put(newX,new HashMap<>());
                }
                map.get(newX).put(newY,dist);
                int next[]=new int[]{newX,newY};
                queue.add(next);
            }
        }
        return 0;
        
    }
}
