// Reverse Words in a String

public class Solution {
    public String reverseWords(String s) {
        if(s==null||s.length()==0)
        {
            return "";
        }
        String arr[]=s.split(" ");
        int len=arr.length-1;
        StringBuilder builder = new StringBuilder();
        for(int i=len;i>=0;i--)
        {
            if(!arr[i].equals(""))
            {
                builder.append(arr[i]);
                builder.append(" ");
            }
            

        }
 
        String result=builder.toString();
        if(result.length()!=0)
        {
            return result.substring(0,result.length()-1);
        }
        return result;
        
    }
}