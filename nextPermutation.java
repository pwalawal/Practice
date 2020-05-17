class Solution {
    public void nextPermutation(int[] nums) {
        
        
        
        int n=nums.length;
        int p=-1,q=-1;
        
        
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                //find first non increasing from right
                p=i;
                break;
            }
        }
        if(p==-1){
            //none exist, so reverse string as current permuation is highest
            reverse(nums,0,n-1);
            return;
        }
        
        for(int j=n-1;j>=p;j--){
            if(nums[j]>nums[p]){
                //find the leaset biggest from the first non increasing from right
                q=j;
                break;
            }
        }
        swap(nums,p,q);
        reverse(nums,p+1,n-1);
        
    }
    
    public void swap(int nums[],int i,int j){
        
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        
    }
    
    public void reverse(int nums[],int i, int j){
        
        while(i<j){
            swap(nums,i++,j--);
        }
    }
}
