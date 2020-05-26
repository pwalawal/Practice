class Solution {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        
        Map<String,Set<String>>graph=new HashMap<>();
        
        //Map<String,String> names=new HashMap<>();
        
        for(List<String>list:accounts){
            String name=list.get(0);
            for(int i=1;i<list.size();i++){
                //names.put(list.get(i),name);
                if(!graph.containsKey(list.get(i))){
                    graph.put(list.get(i),new HashSet<String>());
                }
                if(i==1)continue;
                
                graph.get(list.get(i)).add(list.get(i-1));
                graph.get(list.get(i-1)).add(list.get(i));
            }
        }
        
        Set<String>visited=new HashSet<String>();
        
        List<List<String>> result=new ArrayList<>();
        
        for(List<String>list:accounts){
            if(!visited.contains(list.get(1))){
                List<String>temp=new ArrayList<>();
                bfs(graph,visited,list.get(1),temp);
                Collections.sort(temp);
                temp.add(0,list.get(0));
                result.add(temp);
            }
            
        }
        return result;
        
    }
    
    public void bfs(Map<String,Set<String>>graph,Set<String>visited,String s,List<String>temp){
        Queue<String>queue=new LinkedList<>();
        
        visited.add(s);
        queue.add(s);
        while(!queue.isEmpty()){
            String str=queue.poll();
            temp.add(str);
            for(String child:graph.get(str)){
                if(!visited.contains(child)){
                    queue.add(child);
                    visited.add(child);
                }
            }
        }
    }
}
