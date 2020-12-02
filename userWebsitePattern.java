class Solution {
    public List<String> mostVisitedPattern(String[] username, int[] timestamp, String[] website) {
     
        
        Map<String,List<Pair>>map=new HashMap<>();
        
        int n=username.length;
        // collect the website info for every user, key: username, value: (timestamp, website)
        for(int i=0;i<n;i++){
            map.putIfAbsent(username[i],new ArrayList<Pair>());
            map.get(username[i]).add(new Pair(timestamp[i],website[i]));
        }
        //Store the count of 3 sequence
        Map<String,Integer>count=new HashMap<>();
        
        String res="";
        
        for(String key:map.keySet()){
            //set to avoid duplictae 3 seq for same user
            Set<String>set=new HashSet<>();
            
            List<Pair>list=new ArrayList<>();
            list=map.get(key);
            Collections.sort(list,(a,b)->(a.time-b.time));
            
            for(int i=0;i<list.size();i++){
                for(int j=i+1;j<list.size();j++){
                    for(int k=j+1;k<list.size();k++){
                        String seq=list.get(i).website+"#"+list.get(j).website+"#"+list.get(k).website;
                        
                        if(!set.contains(seq)){
                            set.add(seq);
                            count.put(seq,count.getOrDefault(seq,0)+1);
                        }
                        if (res.equals("") || count.get(res) < count.get(seq) || (count.get(res) == count.get(seq) && res.compareTo(seq) > 0)) {
                            // make sure the right lexi order
                            res = seq;
                        }
                        
                    }
                }
            }
        }
        
        return Arrays.asList(res.split("#"));
        
        
    }
}

class Pair{
    int time;
    String website;
    
    Pair(int time, String website){
        this.time=time;
        this.website=website;
    }
}
