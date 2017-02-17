//H-Index II

public class Solution {
    public int hIndex(int[] citations) {
        if(citations == null || citations.length == 0) {
            return 0;
        }
        
       
        int i=0,j=citations.length;
        int len=citations.length;
        while(i<j){
            int mid=(i+j)/2;
            if(citations[mid]==len-mid){
                return len-mid;
            }
            else if(citations[mid]<len-mid){
                i=mid+1;
            }
            else{
                j=mid;
            }
        }
        return len-i;
        
    }
}