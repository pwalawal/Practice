class Solution {
    public boolean isMatch(String s, String p) {
        
        
        if (s == null || p == null) {
        return false;
    }
        
        boolean[][] dp=new boolean[s.length()+1][p.length()+1];
        
        dp[0][0]=true;
        // dp[i][0] = false(which is default value of the boolean array) since empty pattern cannot match non-empty string
		// dp[0][j]: what pattern matches empty string ""? It should be #*#*#*#*, 
		// and for this case we need to check manually: 
        // as we can see, the length of pattern should be even && the character at the even position should be *, 
        for(int j=1;j<=p.length();j++){
            if(p.charAt(j-1)=='*'){
                if(j>1 && dp[0][j-2]){
                    dp[0][j]=true;
                }
            } 
        }
        for(int i=1;i<=s.length();i++){
            for(int j=1;j<=p.length();j++){
                if(s.charAt(i-1)==p.charAt(j-1)|| p.charAt(j-1)=='.'){
                    dp[i][j]=dp[i-1][j-1];
                }else{
                    if(p.charAt(j-1)=='*'){
                        if(s.charAt(i-1)!=p.charAt(j-2) && p.charAt(j-2)!='.'){
                            dp[i][j]=dp[i][j-2];
                            //can only be counted as empty
                        }else{
                            dp[i][j]=dp[i-1][j]||dp[i][j-1]||dp[i][j-2];
                            //can be counted as empty one or multiple
                        }
                    }
                }
            }
        }
        
        return dp[s.length()][p.length()];
        
    }
}
