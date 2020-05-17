/**
 * The read4 API is defined in the parent class Reader4.
 *     int read4(char[] buf); 
 */

public class Solution extends Reader4 {
    /**
     * @param buf Destination buffer
     * @param n   Number of characters to read
     * @return    The number of actual characters read
     */
    
    int bufSize=0;
    int bufIndex=0;
    char bufTemp[]=new char[4];
    
    public int read(char[] buf, int n) {
        
        
        int total=0;
        
        while(total<n){
            
            if(bufIndex==0){
                //previous read had no buffer left
                bufSize=read4(bufTemp);
            }
            if(bufSize==0){
                break;
                //end of file
            }
            
            while(total<n && bufIndex<bufSize){
                buf[total++]=bufTemp[bufIndex++];
            }
            if(bufIndex==bufSize){
                bufIndex=0;
                //reset index to 0 as all 4 chars were copied
            }
            
        }
        
        return total;
    }
}
