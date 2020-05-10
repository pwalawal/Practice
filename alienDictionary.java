class Solution {
    int map[]=new int[26];
    public boolean isAlienSorted(String[] words, String order) {
        
        
        
        
        for(int i=0;i<order.length();i++){
            map[order.charAt(i)-'a']=i;
        }
        
        for(int i=1;i<words.length;i++){
            if(!compare(words[i-1],words[i])){
                return false;
            }
        }
        return true;
    }
    
    public boolean compare(String word1, String word2){
        
        int m=word1.length();
        int n=word2.length();
        
        for(int i=0;i<m && i<n;i++){
            if(word1.charAt(i)!=word2.charAt(i)){
                return map[word1.charAt(i)-'a']<map[word2.charAt(i)-'a'];
                //return true if its lexologically sorted
            }
        }
        return m<n;
    }
}
