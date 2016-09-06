//Given a m x n matrix, if an element is 0, set its entire row and column to 0. Do it in place.


public class Solution {
    public void setZeroes(int[][] matrix) {
        
        
        
        int r=matrix.length;
        int c=matrix[0].length;
        
        ArrayList<Integer>row=new ArrayList<Integer>();
        ArrayList<Integer>col=new ArrayList<Integer>();
        
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(matrix[i][j]==0)
                {
                    row.add(i);
                    col.add(j);
                }
            }
        }
        
        for(int colnum : col)
        {
            for(int i=0;i<r;i++)
            {
                matrix[i][colnum]=0;
            }
        }
        
        for(int rownum : row)
        {
            for(int j=0;j<c;j++)
            {
                matrix[rownum][j]=0;
            }
        }
    }
}