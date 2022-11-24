
class Solution {
    public void sortColors(int[] nums) {
        int start = 0;
        int end = nums.length -1;

      for(int i =0;i<= end;i++){

          if(nums[i] == 0  ){
             
              int temp = nums[start];
              nums[start] = nums[i];
              nums[i] = temp;
              
              start++;

          }

          
          if(nums[i] == 2){
              int temp = nums[end];
              nums[end] = nums[i];
              nums[i] = temp;
              end--;
              i--;
          }
      }

      
    }
}
