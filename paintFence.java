class Solution {
    public int numWays(int n, int k) {
        
         // if there are no posts, there are no ways to paint them
        if (n == 0) return 0;
        
        // if there is only one post, there are k ways to paint it
        if (n == 1) return k;
        
        // if there are only two posts, you can't make a triplet, so you 
        // are free to paint however you want.
        // first post, k options. second post, k options
        
        int[]table=new int[n+1];
        table[0]=0;
        table[1]=k;
        table[2]=k*k;
        
        for(int i=3;i<=n;i++){
            table[i]=(table[i-1]+table[i-2])*(k-1);
        }
        return table[n];
        
    }
}
