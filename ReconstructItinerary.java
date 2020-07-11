class Solution {
    public List<String> findItinerary(List<List<String>> tickets) {
        
        LinkedList<String>list=new LinkedList<>();
        Map<String, PriorityQueue<String>>map=new HashMap<>();
        Stack<String>stack=new Stack<>();
        for(List<String>ticket:tickets){
            map.putIfAbsent(ticket.get(0),new PriorityQueue<>());
            map.get(ticket.get(0)).add(ticket.get(1));
        }
        
        stack.push("JFK");
        while(!stack.isEmpty()){
            String departure=stack.peek();
            if(map.containsKey(departure) && map.get(departure).size()>0){
                stack.push(map.get(departure).poll());
            }else{
                list.addFirst(stack.pop());
            }
        }
        return list;
                                                         
        
    }
}
