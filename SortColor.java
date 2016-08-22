//Given an array with n objects colored red, white or blue, sort them so that objects of the same color are adjacent, with the colors in the order red, white and blue.

public class Solution {
    public void sortColors(int[] nums) {
        
        if(nums==null||nums.length<2){
        return;
    }
 
   int red=0;
   int blue=nums.length-1;
  
   
  for(int i=0;i<=blue;i++)
   {
       if(nums[i]==0)
       {
       swap(nums,i,red);
       red++;
           
       }
       else if(nums[i]==2)
       {
           swap(nums,i,blue);
           blue--;
           i--;
       }
   }
   
   
   
    }
    private void swap(int array[],int i, int j)
    {
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }
}