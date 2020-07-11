class Solution {
    public void wallsAndGates(int[][] rooms) {
        
        if(rooms==null|| rooms.length==0||rooms[0].length==0)return;
        int m=rooms.length;
        int n=rooms[0].length;
        
        int dirs[][]=new int[][]{{0,1},{1,0},{0,-1},{-1,0}};
        Queue<int[]>queue=new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(rooms[i][j]==0){
                    queue.offer(new int[]{i,j});
                }
            }
        }
        
        while(!queue.isEmpty()){
            int cur[]=queue.poll();
            for(int dir[]:dirs){
                int x=cur[0]+dir[0];
                int y=cur[1]+dir[1];
                if(x<0||x>=m ||y<0||y>=n|| rooms[x][y]!=Integer.MAX_VALUE)continue;
                
                rooms[x][y]=rooms[cur[0]][cur[1]]+1;
                queue.offer(new int[]{x,y});
                
            }
        }
        
    }
}
