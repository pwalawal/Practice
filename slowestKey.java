class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        
        int n=releaseTimes.length;
        int maxDiff=releaseTimes[0];
        char ans=keysPressed.charAt(0);
        
        for(int i=1;i<releaseTimes.length;i++){
            int diff=releaseTimes[i]-releaseTimes[i-1];
            
            if(diff>maxDiff || diff==maxDiff && keysPressed.charAt(i)>ans){
                maxDiff=diff;
                ans=keysPressed.charAt(i);
            }
        }
        return ans;
        
    }
}
