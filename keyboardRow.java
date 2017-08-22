/*
Given a List of words, return the words that can be typed using letters of alphabet on only one row's of American keyboard like the image below.
*/


class Solution {
    public String[] findWords(String[] words) {
        
        String strs[]={"QWERTYUIOP","ASDFGHJKL","ZXCVBNM"};
        
        Map<Character, Integer>map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            for(char c:strs[i].toCharArray()){
                map.put(c,i);
            }
        }
        
        List<String> list=new ArrayList<>();
        for(String w:words){
            String word=w.toUpperCase();
            if(w.equals(""))continue;
            
            int index=map.get(word.charAt(0));
            for(char c:word.toCharArray()){
                if(map.get(c)!=index){
                    index=-1;
                    break;
                }
                
            }
            
            if(index!=-1){
                list.add(w);
            }
        }
        
        String[] res = new String[list.size()];
        for(int i = 0; i < res.length; i ++){
            res[i] = list.get(i);
        }
        return res;
        
        
    }
}