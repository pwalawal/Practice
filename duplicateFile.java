
// Find Duplicate File in System

class Solution {
    public List<List<String>> findDuplicate(String[] paths) {
        
        List<List<String>> result=new LinkedList<>();
        Map<String,List<String>> map=new HashMap<>();
        
        for(String str:paths){
            String tokens[]=str.split(" ");
            for(int i=1;i<tokens.length;i++){
                String file=tokens[i].substring(0,tokens[i].indexOf("("));
                String content=tokens[i].substring(tokens[i].indexOf("(")+1,tokens[i].length()-1);
                map.putIfAbsent(content,new LinkedList<String>());
                map.get(content).add(tokens[0] + "/" + file);
            }
        }
        
        for(List<String> list:map.values()){
            if(list.size()>1){
                result.add(list);
            }
        }
        
        return result;
        
            
            
        
        
        
        
        
    }
}