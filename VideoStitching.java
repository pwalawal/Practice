class Solution {
    public int videoStitching(int[][] clips, int T) {
     
        int end=0, currentFarthest=0,count=0;
        
        Arrays.sort(clips, (a,b)->(a[0]-b[0]));
        //sort time start time
        
        if(clips[clips.length-1][1]<T)return -1;
        int i=0;
        
        while(i<clips.length && end<T){
            count++;
            //check all the clips less than the end
            while(i<clips.length && clips[i][0]<=end){
                currentFarthest=Math.max(currentFarthest,clips[i][1] );
                i++;  
            }
            
            if(end==currentFarthest)return -1;
            // if "farCanReach" isn't updated after we checked all elements within the range, we will fail in next step. 
            end=currentFarthest;
        }
        return count;
        
    }
}
