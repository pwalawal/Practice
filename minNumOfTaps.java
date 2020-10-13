class Solution {
    public int minTaps(int n, int[] ranges) {
        
        int arr[]=new int[ranges.length];
        
        for(int i=0;i<ranges.length;i++){
            if(ranges[i]==0)continue;
            int left=Math.max(0,i-ranges[i]);
            arr[left]=Math.max(arr[left],i+ranges[i]);
        }
        
        int end=0,currentFarthest=0,count=0;
        int i=0;
        while(i<arr.length && end<n){
            count++;
            while(i<arr.length && i<=end){
                currentFarthest=Math.max(currentFarthest,arr[i]);
                i++;
            }
            if(currentFarthest==end)return -1;
            end=currentFarthest;
        }
        return count;
    }
}
