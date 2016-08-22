//Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.

public class Solution {
    public int trap(int[] height) {
        if(height==null||height.length==0)
        return 0;
        int result=0;
        int max=height[0];
        int left[]=new int[height.length];
        int right[]=new int[height.length];
        left[0]=height[0];
        for(int i=1;i<height.length;i++)
        {
            if(max>height[i])
            {
                left[i]=max;
            }
            else
            {
                left[i]=height[i];
                max=left[i];
            }
        }
        
        max=height[height.length-1];
        right[height.length-1]=height[height.length-1];
        
        for(int i=height.length-2;i>=0;i--)
        {
            if(height[i]< max)
            {
                right[i]=max;
            }
            else
            {
                right[i]=height[i];
                max=height[i];
            }
        }
        
        
        for(int i=0;i<height.length;i++)
        {
            result=result+Math.min(left[i],right[i])-height[i];
        }
        return result;
    }
}