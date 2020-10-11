class TweetCounts {

    Map<String, TreeMap<Integer,Integer>>map;
    public TweetCounts() {
        map=new HashMap<>();
    }
    
    public void recordTweet(String tweetName, int time) {
        map.putIfAbsent(tweetName,new TreeMap<>());
        TreeMap<Integer,Integer>tm=map.get(tweetName);
        tm.put(time,tm.getOrDefault(time,0)+1);
        map.put(tweetName,tm);
    }
    
    public List<Integer> getTweetCountsPerFrequency(String freq, String tweetName, int startTime, int endTime) {
        
        List<Integer>result=new ArrayList<>();
        
        if(!map.containsKey(tweetName))return result;
        TreeMap<Integer,Integer> tm=map.get(tweetName);
        
        
        int gap=60;
        if(freq.equals("hour")) gap=gap*60;
        if(freq.equals("day")) gap=gap*60*24;
        
        for(int i=startTime;i<endTime+1;i+=gap){
            int sum=0;
            
            int end=Math.min(i+gap,endTime+1);
            Map<Integer,Integer>temp=tm.subMap(i,end);
            
            for(int value:temp.values()){
                sum+=value;
            }
            result.add(sum);
        }
    
        return result;
    }
}

/**
 * Your TweetCounts object will be instantiated and called as such:
 * TweetCounts obj = new TweetCounts();
 * obj.recordTweet(tweetName,time);
 * List<Integer> param_2 = obj.getTweetCountsPerFrequency(freq,tweetName,startTime,endTime);
 */
