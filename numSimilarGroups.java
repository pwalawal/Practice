class Solution {
    public int numSimilarGroups(String[] A) {
        
        boolean[]visited=new boolean[A.length];
        
        int count=0;
        if(A==null || A.length==0)return count;
        
        Queue<String>queue=new LinkedList<>();
        
        for(int i=0;i<A.length;i++){
            
            if(visited[i]==true)continue;
            
            visited[i]=true;
            count++;
            queue.add(A[i]);
            while(!queue.isEmpty()){
                String cur=queue.poll();
                for(int j=0;j<A.length;j++){
                    if(visited[j]==true)continue;
                    if(isSameGroup(cur,A[j])){
                        visited[j]=true;
                        queue.add(A[j]);
                    }
                }
            }
            
        }
        return count;
        
    }
    
    public boolean isSameGroup(String a, String b){
        
        int diff=0;
        
        int i=0;
        while(i<a.length()){
            if(a.charAt(i)!=b.charAt(i))diff++;
            i++;
        }
        
        return diff==2||diff==0;
    }
}
