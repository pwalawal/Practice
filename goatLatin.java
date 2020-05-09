class Solution {
    public String toGoatLatin(String S) {
        
        
        Set<Character> vowels=new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        
        String words[]=S.split(" ");
        
        StringBuilder sb=new StringBuilder();
        
        int aCount=1;
        for(int i=0;i<words.length;i++){
            
            if(vowels.contains(words[i].charAt(0))){
                sb.append(words[i]);
            }else{
                sb.append(words[i].substring(1)).append(words[i].charAt(0));
            }
            
            sb.append("ma");
            
            for(int j=0;j<aCount;j++){
                sb.append("a");
            }
            
            sb.append(" ");
            aCount++;
            
        }
        return sb.toString().substring(0,sb.length()-1);
        
       
    }
}
