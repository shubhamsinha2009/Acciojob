
// Question Link -- https://leetcode.com/problems/median-of-two-sorted-arrays/

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        
        int merged[] = new int[m+n];

      int i = 0;
      int j = 0 ;
      int k = 0 ;
        while(i<= merged.length/2 && k <n && j<m ){
     
            if(nums1[j] < nums2[k]){
                merged[i++] = nums1[j++];
            } else{
                merged[i++]= nums2[k++];
            }
          
        }
         while(i<= merged.length/2 && k<n){
     
          
                merged[i++]= nums2[k++];
            
          
        }
         while(i<= merged.length/2 && j<m ){
     
          
                merged[i++] = nums1[j++];
           
        }

        if(merged.length % 2 == 0){
            return (double) (merged[merged.length/2 ] + merged[merged.length/2 - 1])/2 ;
           
        }else{
            return merged[merged.length/2 ] ;
        }
 
    }
}
