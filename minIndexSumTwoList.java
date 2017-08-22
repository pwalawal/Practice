
//min Index Sum of Two List


class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        
        HashMap<String,Integer>map=new HashMap<>();
        
        for(int i=0;i<list1.length;i++){
            map.put(list1[i],i);
        }
        int min=Integer.MAX_VALUE;
        List<String> list=new ArrayList<>();
        for(int i=0;i<list2.length;i++){
            if(map.containsKey(list2[i])){
                int j=map.get(list2[i]);
                if(i+j<min){
                    list=new ArrayList<>();
                    min=i+j;
                    list.add(list2[i]);
                }
                else if(i+j==min){
                    list.add(list2[i]);
                }
            }
        }
        
        String[] result = new String[list.size()];
        return list.toArray(result);
        
    }
}