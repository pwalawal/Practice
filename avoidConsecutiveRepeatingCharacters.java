class Solution {
    public String modifyString(String s) {
        
        char[] word=s.toCharArray();
        
        for(int i=0;i<s.length();i++){
            if(word[i]=='?'){
                word[i]='a';
                
                char left=i==0?'z':word[i-1];
                char right=i==(s.length()-1)?'z':word[i+1];
                while(word[i]==left || word[i]==right)word[i]++;
                
                
                
            }
        }
        return new String(word);
    }
}
