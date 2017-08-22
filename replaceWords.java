/*
Replace WordsIn English, we have a concept called root, which can be followed by some other words to form another longer word - let's call this word successor. For example, the root an, followed by other, which can form another word another.

*/

class Solution {
    public String replaceWords(List<String> dict, String sentence) {
        
        
        if(dict==null||dict.size()==0){
            return sentence;
        }
        
        HashSet<String>set=new HashSet<>();
        
        for(String str:dict){
            set.add(str);
        }
        
        StringBuilder sb=new StringBuilder();
        String words[]=sentence.split("\\s+");
        
        for(String word:words){
            String prefix="";
            
            for(int i=1;i<=word.length();i++){
                
                prefix=word.substring(0,i);
                if(set.contains(prefix))
                    break;
                
            }
            sb.append(" "+prefix);
        }
        
        return sb.deleteCharAt(0).toString();
        
    }
}