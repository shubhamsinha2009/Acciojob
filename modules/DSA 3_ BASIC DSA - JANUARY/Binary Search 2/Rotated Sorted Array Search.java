
// Question Link -- https://course.acciojob.com/idle?question=9c215979-6be0-4055-8a42-9d20c4b90169

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
  public static void main (String[] args)
	{
    Scanner sc = new Scanner(System.in);
	    
	  int N = sc.nextInt();
	  int[] A = new int[N];
	  for(int i=0;i<N;i++){
          A[i] = sc.nextInt();
      }
	  int B = sc.nextInt();
	  Solution ob = new Solution();
    System.out.println(ob.search(A,B));
		
	}
}

class Solution{
    public int search(final int[]nums, int target) {
         int low =0;
        int high = nums.length-1;

       while(low<=high){

           int mid = (low+high)/2;

        if(nums[mid] == target) return mid;

        else if(nums[mid] >= nums[low]){
            // left half is sorted 
                if(nums[low] <= target && target < nums[mid]){
                    high = mid-1;
                }else{
                    low=mid+1;
                }
        }else{

                // rigth half is sorted 
                if(nums[high] >= target && target > nums[mid]){
                     low=mid+1;
                }else{
                   high = mid-1;
                }    
        }
        
       } 

       return -1;
    }
}
