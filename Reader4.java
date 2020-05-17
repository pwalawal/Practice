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
    public int read(char[] buf, int n) {
        
        
        char temp[]=new char[4];
        boolean eof=false;
        int total=0;
        
        while(!eof && total<n){
            
            int readFile=read4(temp);
            //get the char for read4 in readFile 
            // populate temp array
            
            if(readFile<4){
                eof=true;
            }
            //see if end of file is reached
            
            readFile=Math.min(readFile,n-total);
            
            for(int i=0;i<readFile;i++){
                buf[total++]=temp[i];
            }
            
        }
        
        return total;
    }
}
