/*
The set S originally contains numbers from 1 to n. But unfortunately, due to the data error, one of the numbers in the set got duplicated to another number in the set, which results in repetition of one number and loss of another number.
*/

class Solution {
    public int[] findErrorNums(int[] nums) {
        
        HashSet<Integer>set=new HashSet<>();
        int duplicate=0;
        int n=nums.length;
        int sum=(n*(n+1))/2;
        
        for(int i:nums){
            if(set.contains(i))duplicate=i;
            
            sum-=i;
            set.add(i);
        }
        
        return new int[]{duplicate,sum+duplicate};
        
    }
}