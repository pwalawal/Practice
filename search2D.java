/*
Search a 2D matrix
Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:

Integers in each row are sorted from left to right.
The first integer of each row is greater than the last integer of the previous row.
*/


public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        
        int m=matrix.length;
        int n=matrix[0].length;
        if(matrix==null|| target<matrix[0][0]|| target>matrix[m-1][n-1])
        {
            return false;
        }
        int start=0;
        int end=(m*n)-1;
        int mid,x,y;
        
        //binary search
        while(start<=end)
        {
            mid=(start+end)/2;
            //finding the middle of 2D matrix
            x=mid/n;
            y=mid%n;
            
            if(matrix[x][y]==target)
            {
                return true;
            }
            
            if(matrix[x][y]<target)
            {
                start=mid+1;
            }
            else{
                end=mid-1;
            }
            
        }
        
        return false;
        
        
        
    }
}