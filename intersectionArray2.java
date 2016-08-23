/*
Given two arrays, write a function to compute their intersection.

Example:
Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2].

Note:
Each element in the result should appear as many times as it shows in both arrays.
The result can be in any order.

*/

public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        for(int i:nums1)
        {
            if(hm.containsKey(i))
            {
                hm.put(i,hm.get(i)+1);
            }
            else
            hm.put(i,1);
        }
        
        ArrayList<Integer>al=new ArrayList<Integer>();
        for(int i:nums2)
        {
            if(hm.containsKey(i))
            {
                if(hm.get(i)>1)
                {
                    hm.put(i,hm.get(i)-1);
                }
                else
                {
                    hm.remove(i);
                }
                al.add(i);
            }
        }
        
        int[] result=new int[al.size()];
        int i=0;
        for(int n:al)
        {
            result[i++]=n;
        }
        return result;
    }
}