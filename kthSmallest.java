//Kth Smallest Element in a Sorted Matrix

public class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        
        int n=matrix.length;
        int low=matrix[0][0];
        int high=matrix[n-1][n-1];
        
        while(low<high)
        {
            int mid=low+(high-low)/2;
            int temp=count(matrix,mid);
            if(temp<k)
            {
                low=mid+1;
            }
            else
            {
                high=mid;
            }
        }
        return high;
    }
    
    public int count(int[][]matrix,int mid)
    {
        int n=matrix.length;
        int i=n-1;
        int j=0;
        int count=0;
        
        while(i>=0 && j<n)
        {
            if(matrix[i][j]<=mid)
            {
                count=count+i+1;
                j++;
            }
            else
            {
                i--;
            }
        }
        return count;
    }
}