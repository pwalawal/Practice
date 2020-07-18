class Solution {
    public int longestOnes(int[] A, int K) {
     
        //Translate to longest subarray with atmost K 0s
        
        int i=0;
        int j=0;
        
        int max=0;
        int count=0;
        while(i<A.length){
            if(A[i]==0){
                count++;
            }
            i++;
            while(count>K){
                if(A[j]==0){
                    count--;
                }
                j++;
            }
            max=Math.max(max,i-j);
        }
        return max;
    }
}
