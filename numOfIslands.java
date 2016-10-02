/*
Number of Islands:
Given a 2d grid map of '1's (land) and '0's (water), count the number of islands. An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.

*/


public class Solution {
    public int numIslands(char[][] grid) {
        
        if(grid==null||grid.length==0||grid[0].length==0)
        {
            return 0;
        }
        
        int result=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1')
                {
                    result++;
                    connectIslands(grid,i,j);
                    
                }
            }
        }
        return result;
        
    }
    
    public void connectIslands(char[][] grid, int i,int j)
    {
        if(i<0||i>=grid.length||j<0||j>=grid[0].length||grid[i][j]!='1')
        {
            return;
        }
        
        grid[i][j]='I';
        connectIslands(grid,i-1,j);
        connectIslands(grid,i+1,j);
        connectIslands(grid,i,j-1);
        connectIslands(grid,i,j+1);
        
        
    }
}