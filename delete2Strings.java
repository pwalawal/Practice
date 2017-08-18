//Delete Operation for Two Strings

class Solution {
    public int minDistance(String word1, String word2) {
        
        int longest=longestCommon(word1,word2);
        return word1.length()-longest+word2.length()-longest;
        
    }
    
    public int longestCommon(String word1, String word2){
        
        int [][]matrix=new int[word1.length()+1][word2.length()+1];
        
     
        
        for(int i=1;i<=word1.length();i++){
            for(int j=1;j<=word2.length();j++){
                if(word1.charAt(i-1)==word2.charAt(j-1)){
                    matrix[i][j]=matrix[i-1][j-1]+1;
                    
                }
                else{
                    matrix[i][j]=Math.max(matrix[i-1][j],matrix[i][j-1]);
                }
                
            }
        }
        return matrix[word1.length()][word2.length()];
        
    }
}