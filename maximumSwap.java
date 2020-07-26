class Solution {
    public int maximumSwap(int num) {
        
        int partition=-1;
        int maxNum=0;
        int maxIdx=-1;
        
        
        char []nums=String.valueOf(num).toCharArray();
        
        //scan from left to see where decreasing order breaks
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                partition=i;
                break;
            }
        }
        if(partition==-1)return num;
        //if everything is decreasing, return it as it is
        
        
        //find max num from the scond partition
        //get the rightmost in case of duplicates of max num
        for(int i=partition;i<nums.length;i++){
            if(nums[i]>=maxNum){
                maxNum=nums[i];
                maxIdx=i;
            }
        }
        
        //scan from left and find the first number smaller than the max

        for(int i=0;i<maxIdx;i++){
            if(nums[i]<maxNum){
                char temp=nums[i];
                nums[i]=(char)maxNum;
                nums[maxIdx]=temp;
                break;
            }
        }
        
        String result=String.valueOf(nums);
        return Integer.parseInt(result);
    }
}
