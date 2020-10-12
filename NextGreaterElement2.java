class Solution {
    public int[] nextGreaterElements(int[] nums) {
        
        int result[]=new int[nums.length];
        Arrays.fill(result,-1);
        int n=nums.length;
        Stack<Integer>stack=new Stack<>();
        for(int i=0;i<n*2;i++){
            while(!stack.isEmpty() && nums[i%n]>nums[stack.peek()]){
                result[stack.pop()]=nums[i%n];
            }
            stack.push(i%n);
        }
        return result;
        
    }
}
