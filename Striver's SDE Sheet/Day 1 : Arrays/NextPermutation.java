
class Solution {
    private void swap(int i , int j , int[] nums){
             int temp = nums[i];
                nums[i] = nums[j];
                nums[j] =  temp; 
    }

    private void reverse(int start, int end, int[] nums ){
       while(start<end) swap(start++, end-- , nums);         
    }
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        if( nums == null  || n <= 1) return; 
        int i = n-2 ;
        while(i >= 0 && nums[i] >= nums[i+1]) i--;
        int j = n-1 ;
        if(i >=0){
            while(  nums[i] >= nums[j]) j--;
            swap(i,j,nums);
        }
         reverse(i+1,n-1, nums );  
    }
}
