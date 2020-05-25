class Solution {
    public int[][] multiply(int[][] A, int[][] B) {
        
        int m=A.length;
        int nA=A[0].length;
        int nB=B[0].length;
        
        int result[][]=new int[m][nB];
        
        for(int i=0;i<m;i++){
            for(int j=0;j<nA;j++){
                if(A[i][j]!=0){
                    for(int k=0;k<nB;k++){
                        if(B[j][k]!=0){
                            result[i][k]+=A[i][j]*B[j][k];
                        }
                    }
                }
            }
        }
        return result;
        
    }
}
