// Island Perimeter

class Solution {
    public int islandPerimeter(int[][] grid) {
        
        int island=0,neighbor=0;
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    island++;
                
                if(i>0 && grid[i-1][j]==1 ){
                    neighbor++;
                }
                if(j>0 && grid[i][j-1]==1){
                    neighbor++;
                }
                }
            }
        }
        return 4*island-2*neighbor;
        
    }
}