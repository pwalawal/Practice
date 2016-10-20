//Given an array of integers, every element appears three times except for one. Find that single one.

public class Solution {
    public int singleNumber(int[] nums) {
        
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        
        for(int num: nums)
        {
            if(hm.containsKey(num))
            {
                if(hm.get(num)==2)
                {
                    hm.remove(num);
                }
                else
                hm.put(num,hm.get(num)+1);
            }
            else
            {
               hm.put(num,1); 
            }
        }
        
        for(Integer num:hm.keySet())
        return num;
        
        return 0;
    }
}