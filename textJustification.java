class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        
        int left=0;
        List<String>result=new ArrayList<>();
        while(left<words.length){
            int right=findRight(left,words,maxWidth);
            result.add(justify(left,right,words,maxWidth));
            left=right+1;
        }
        return result;
        
    }
    
    public int findRight(int left, String[] words, int maxWidth){
        
        int len=-1;
        int right=left;
        while(right<words.length && (len+words[right].length()+1)<=maxWidth){
            len+=words[right].length()+1;
            right++;
        }
        return right-1;
        
    }
    
    public String justify(int left,int right, String[] words, int maxWidth){
        if(right-left==0)return padResult(words[left],maxWidth);
        
        boolean isLast=right==words.length-1;
        int numSpace=right-left;
        int totalSpace=maxWidth-findLength(left,right,words);
        
        String space=isLast?" ":blank(totalSpace/numSpace);
        int reminder=isLast?0:(totalSpace%numSpace);
        
        StringBuilder sb=new StringBuilder();
        
        for(int i=left;i<=right;i++){
            sb.append(words[i]).append(space);
            sb.append(reminder-->0?" ":"");
        }
        return padResult(sb.toString().trim(),maxWidth);
        
        
    }
    
    public int findLength(int left,int right, String[] words){
        int length=0;
        for(int i=left;i<=right;i++){
            length+=words[i].length();
        }
        return length;
    }
    
    public String padResult(String word, int maxWidth){
        return word+ blank(maxWidth-word.length());
    }
    
    public String blank(int length){
        
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<length;i++){
            sb.append(" ");
        }
        return sb.toString();
    }
    
}
