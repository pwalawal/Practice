class Solution {
    public int minMutation(String start, String end, String[] bank) {
        
        if(start.equals(end))return 0;
        
        int count=0;
        
        char[]choices=new char[]{'A','C','G','T'};
        
        Set<String>set=new HashSet<>();
        for(String b:bank)set.add(b);
        
       // HashSet<String> visited=new HashSet<>();
        Queue<String>queue=new LinkedList<>();
        
        queue.add(start);
        //visited.add(start);
        
        while(!queue.isEmpty()){
            int size=queue.size();
            
            while(size-->0){
                String cur=queue.poll();
                
                if(cur.equals(end))return count;
                
                char[]curArr=cur.toCharArray();
                for(int i=0;i<curArr.length;i++){
                    char old=curArr[i];
                    for(char c:choices){
                        curArr[i]=c;
                        String next=new String(curArr);
                        if(set.contains(next)){
                            if(next.equals(end))return count+1;
                            queue.add(next);
                            //visited.add(next);
                            set.remove(next);
                        }
                    }
                    curArr[i]=old;
                }
                
            }
            count++;
        }
        
        return -1;
        
    }
}
