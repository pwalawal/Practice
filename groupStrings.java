class Solution {
    public List<List<String>> groupStrings(String[] strings) {
        
        List<List<String>> result=new ArrayList<>();
        HashMap<String, List<String>>map=new HashMap<>();
        for(String s:strings){
            String key=getKey(s);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }
        
        for(List<String> temp:map.values()){
            result.add(temp);
        }
        return result;
        
    }
    
    public String getKey(String s){
        
        char ch[]=s.toCharArray();
        StringBuilder sb=new StringBuilder();
        sb.append("");
        for(int i=1;i<ch.length;i++){
            int diff=ch[i]-ch[i-1];
            diff=diff<0?(26+diff):diff;
            sb.append(diff);
            sb.append("#");
        }
        return sb.toString();
    }
}
