class Solution {
    public String addBoldTag(String s, String[] dict) {
        
        boolean flag[]=new boolean[s.length()];
        int end=0;
        for(int i=0;i<s.length();i++){
            for(String d:dict){
                int len=d.length();
                if(s.startsWith(d,i)){
                    end=Math.max(end,i+len);
                    //find the max char for a particular string which will be bold
                }
            }
            flag[i]=end>i;
            //mark flag for characters which will be bold
        }
        int i=0;
        StringBuilder sb=new StringBuilder();
        while(i<s.length()){
            if(flag[i]){
                int j=i;
                while(j<s.length() && flag[j]){
                    j++;
                }
                sb.append("<b>").append(s.substring(i,j)).append("</b>");
                i=j;
            }else{
                sb.append(s.charAt(i));
                i++;
            }
        }
        return sb.toString();
    }
}
