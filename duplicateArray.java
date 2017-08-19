//Find All Duplicates in an Array

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        HashSet<Integer>once=new HashSet<>();
        HashSet<Integer>repeat=new HashSet<>();
        
        List<Integer> list=new ArrayList<>();
        
        for(int n:nums){
            if(repeat.contains(n)){
                continue;
            }
            else if(once.contains(n)){
                repeat.add(n);
                once.remove(n);
            }
            else{
                once.add(n);
            }
        }
        
        for(int n:repeat){
            list.add(n);
        }
        
        return list;
        
        
    }
}