class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        //If you transform the input array into binary, then the problem becomes the 'Subarray Sum Equals K' problem. You can think of k odd numbers means sum of then is k.
        int preSum=0;
        
        HashMap<Integer,Integer>map=new HashMap<>();
        int count=0;
        map.put(0,1);
        for(int num:nums){
            num=num%2==0?0:1;
            preSum+=num;
            count+=map.getOrDefault(preSum-k,0);
            map.put(preSum,map.getOrDefault(preSum,0)+1);
            
        }
        return count;
    }
}
