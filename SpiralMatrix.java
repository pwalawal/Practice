//Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.

public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
     
        
        ArrayList<Integer> list=new ArrayList<Integer>();
         
        if(matrix==null|| matrix.length==0)
        return list;
        
        
         int m=matrix.length;
        int n=matrix[0].length;
       
        int x=0;
        int y=0;
        
        while(m>0 && n>0)
        {
            if(m==1)
            {
            for(int i=0;i<n;i++)
            {
                list.add(matrix[x][y++]);
            }
            break;
            }
            if(n==1)
            {
            for(int i=0;i<m;i++)
            {
                list.add(matrix[x++][y]);
            }
            break;
            }
            
            for(int i=0;i<n-1;i++)
            {
                list.add(matrix[x][y++]);
            }
            
            for(int i=0;i<m-1;i++)
            {
                list.add(matrix[x++][y]);
            }
             
            for(int i=0;i<n-1;i++)
            {
                list.add(matrix[x][y--]);
            }
            for(int i=0;i<m-1;i++)
            {
                list.add(matrix[x--][y]);
            }
            
            x++;
            y++;
            m=m-2;
            n=n-2;
            
            
        }
        
        return list;
        
        
    }
}