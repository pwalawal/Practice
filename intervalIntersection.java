class Solution {
    public int[][] intervalIntersection(int[][] A, int[][] B) {
        
        
        List<int[]>list=new ArrayList<>();
        
        int i=0,j=0;
        int m=A.length;
        int n=B.length;
        
        while(i<m && j<n){
            int start=Math.max(A[i][0],B[j][0]);
            int end=Math.min(A[i][1],B[j][1]);
            //find the max start and min end to find the intersection
            
            if(start<=end){
                list.add(new int[]{start,end});
            }
            if(A[i][1]>B[j][1]){
                j++;
            }else{
                i++;
            }
        }
        
        return list.toArray(new int[list.size()][2]);
        
        
    }
}
