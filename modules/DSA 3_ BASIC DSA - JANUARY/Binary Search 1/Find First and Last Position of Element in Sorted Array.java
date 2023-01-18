
// Question Link - https://course.acciojob.com/idle?question=5a206680-d1df-4e82-8196-dd13f35ba139

import java.util.*;

public class Main {
    public static void findPosition(int a[], int n,int k)
    {
        int[]  ans = searchRange(a,k);

		System.out.println(ans[0]+" "+ans[1]);
    }

	 public static int[] searchRange(int[] nums, int target) {
        int[] result = new int[]{-1,-1};
        int n = nums.length;

        if(n<=0) return result;

        int low = 0;
        int high = n-1;

        while(low<=high){
             int mid = low + ((high-low)/2);
               if (nums[mid] < target){
                low = mid +1;
            } else if (nums[mid] > target){
                high = mid - 1;
            } else { 
               result[0] = findFirst(nums,target,low,high);
                result[1] = findLast(nums,target,low,high); 
                return result;
            }
        }
        
        return result;
        
    }
    
    public static int findFirst(int[] nums, int target,int low,int high){
        
        int result = -1;
        while(low <= high){
            int mid = low + ((high-low)/2);

            if (nums[mid] < target){
                low = mid +1;
            } else if (nums[mid] > target){
                high = mid - 1;
            } else { 
                result = mid;
                high = mid - 1; 
   
            }
        }

        return result;
  
    }
    
        public static int findLast(int[] nums, int target ,int low,int high){
        
        int result = -1;
        
        while(low <= high){
            
            int mid = low + (high-low)/2;
            
            if (nums[mid] < target){
                low = mid +1;
            } else if (nums[mid] > target){
                high = mid - 1;
            } else { 
                result = mid;
 
                low = mid + 1;
   
            }
        }

        return result;
        
    }
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int k= sc.nextInt();
        int array[] = new int[n];

        for(int i=0; i<n; i++){
            array[i]= sc.nextInt();
        }
        findPosition(array,n,k);
    }
}
