//Count Binary Substrings

class Solution {
    public int countBinarySubstrings(String s) {
        
        int pre=0;
        int cur=1;
        int count=0;
        
        for(int i=1;i<s.length();i++){
            //count continous number of 1 or 0
            if(s.charAt(i)==s.charAt(i-1)){
                cur++;
            }
            else{
                //as soon as it changes save the number of continous 1 and 0 in pre and reset the cur counter
                pre=cur;
                cur=1;
            }
            if(pre>=cur){
                //whnever the previous run is greater than or equal to cur add the count
                count++;
            }
        }
        return count;
    }
}