class Solution {
    public List<String> findStrobogrammatic(int n) {
        
        Map<Character,Character>map=new HashMap<>();
        
        map.put('1','1');
        map.put('8','8');
        map.put('6','9');
        map.put('9','6');
        map.put('0','0');
        
        List<String> list=new ArrayList<>();
        if(n%2==0){
            list.add("");
        }else{
            list.add("1");
            list.add("8");
            list.add("0");
        }
        
        for(int i=(n%2==0)?0:1;i<n;i+=2){
            List<String>current=new ArrayList<>();
            
            for(char c:map.keySet()){
                for(String s:list){
                    //dont add leading zero
                    if(i!=n-2 || c!='0'){
                        current.add(c+s+map.get(c));
                    }
                }
            }
            list=current;
        }
        return list;
    }
}
