class LogSystem {

    HashMap<Integer,String>map;
    public LogSystem() {
        map=new HashMap<>();
    }
    
    public void put(int id, String timestamp) {
        map.put(id,timestamp);
    }
    
    public List<Integer> retrieve(String s, String e, String gra) {
        
        int index=0;
        
        switch(gra){
            case "Year":
                index=4;
                break;
            case "Month":
                index=7;
                break;
            case "Day":
                index=10;
                break;
            case "Hour":
                index=13;
                break;
            case "Minute":
                index=16;
                break;
            case "Second":
                index=19;
                break;
        }
        
        s=s.substring(0, index);
        e=e.substring(0,index);
        
        List<Integer> result=new ArrayList<>();
        
        for(Integer i:map.keySet()){
            String ss=map.get(i).substring(0,index);
            
            if(ss.compareTo(s)>=0 && ss.compareTo(e)<=0){
                result.add(i);
            }
        }
        
        return result;
    }
}

/**
 * Your LogSystem object will be instantiated and called as such:
 * LogSystem obj = new LogSystem();
 * obj.put(id,timestamp);
 * List<Integer> param_2 = obj.retrieve(s,e,gra);
 */
