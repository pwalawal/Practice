class Solution { 
    
    public int rotatedDigits(int N) {
    
         List<Integer>unchanged=new ArrayList<>();
        List<Integer>changed=new ArrayList<>();
        unchanged.addAll(Arrays.asList(0,1,8));
        changed.addAll(Arrays.asList(2,5,6,9));
        
        int dp[]=new int[N+1];
        
        int count=0;
        
        for(int i=0;i<=N;i++){
            if(i<10){
                if(unchanged.contains(i)){
                    dp[i]=1;
                }else if(changed.contains(i)){
                    dp[i]=2;
                    count++;
                }
            }
            else{
                int a=dp[i/10],b=dp[i%10];
                
                if(a==1 && b==1){
                    dp[i]=1;
                }else if(a>=1 && b>=1){
                    dp[i]=2;
                    count++;
                }
            }
            
        }
        return count;
        
      
    }
   
}
