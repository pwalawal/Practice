//Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        
        while(k>=0)
        {
            if(j<0 || i>=0 && nums1[i]>nums2[j])
            {
                nums1[k--]=nums1[i--];
                
            }
            else
            {
                nums1[k--]=nums2[j--];
                
            }
        }
        
    }
}