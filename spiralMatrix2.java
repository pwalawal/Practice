/*
Given an integer n, generate a square matrix filled with elements from 1 to n2 in spiral order.

For example,
Given n = 3,
*/

public class Solution {
    public int[][] generateMatrix(int n) {
    
   
        int [][]result=new int[n][n];
        int j=1;
        int left=0;
        int top=0;
        int right=n-1;
        int bottom=n-1;
        
        
       while(j<=n*n)
       {
           for(int i=left;i<=right;i++)
           {
               result[top][i]=j++;
           }
           top++;
           for(int i=top;i<=bottom;i++)
           {
               result[i][right]=j++;
           }
           right--;
           for(int i=right;i>=left;i--)
           {
               result[bottom][i]=j++;
           }
           bottom--;
           for(int i=bottom;i>=top;i--)
           {
               result[i][left]=j++;
           }
           left++;
           
       }
        return result;
        
        
    }
}