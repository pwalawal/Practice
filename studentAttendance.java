
//Student Attendance Record I
class Solution {
    public boolean checkRecord(String s) {
        
      
        int countA=0;
        int countL=0;
        for(int i=0;i<s.length();i++){
            
            if(s.charAt(i)=='L'){
                countL++;
            }
            else{
                countL=0;
                if(s.charAt(i)=='A'){
                    countA++;
                }
            }
            if(countA>1||countL>2){
                return false;
            }
        }
        return true;
        
    }
}