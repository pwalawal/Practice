class Solution {
    HashMap<String, List<String>>map=new HashMap<>();
    
    public List<String> wordBreak(String s, List<String> wordDict) {
    
        return backtrack(s,wordDict);
    }
    
    public List<String> backtrack(String s, List<String> wordDict){
        
        if(map.containsKey(s)){
            return map.get(s);
        }
        
        List<String>list=new ArrayList<>();
        for(String word: wordDict){
            if(!s.startsWith(word))continue;
            String next=s.substring(word.length());
            if(next.length()==0){
                list.add(word);
                continue;
            }
            for(String sub:backtrack(next,wordDict)){
                list.add(word+" "+sub);
            }
            
        }
            map.put(s,list);
            return list;
    }
}
