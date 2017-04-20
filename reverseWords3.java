//Reverse Words in a String III

public class Solution {
    public String reverseWords(String s) {
        String[] strs=s.split(" ");
        StringBuilder sb=new StringBuilder();
        for(String str:strs){
            StringBuilder temp=new StringBuilder(str);
            sb.append(temp.reverse());
            sb.append(" ");
        }
        return sb.substring(0,sb.length()-1).toString();
    }
}