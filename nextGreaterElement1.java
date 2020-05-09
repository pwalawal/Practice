class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        
        int result[]=new int[nums1.length];
        
        HashMap<Integer,Integer>map=new HashMap<>();
        
        Stack<Integer>stack=new Stack<>();
        
        for(int num:nums2){
            //maintain a stack of decreasing numbers of nums2 array
            while(!stack.isEmpty() && stack.peek()<num){
                map.put(stack.pop(),num);
            }
            
            stack.push(num);
        }
        
        for(int i=0;i<nums1.length;i++){
            result[i]=map.getOrDefault(nums1[i],-1);
        }
        return result;
    }
}
