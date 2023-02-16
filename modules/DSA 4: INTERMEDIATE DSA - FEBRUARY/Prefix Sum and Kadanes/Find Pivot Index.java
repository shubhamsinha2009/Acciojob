
// Question Link -- https://course.acciojob.com/idle?question=c4eb459b-ea8e-4c06-a898-5d87646be90e

import java.util.*;

class Solution {
    public int pivotIndex(int[] nums) {
        int sum =0;
		int n = nums.length;
		for(int i=1;i<n;i++){
			nums[i]+=nums[i-1];
		}


		for(int i=0;i<n;i++){
			if(i==0){
				if(nums[n-1] - nums[0] ==0)
				 return i;
			}else if(i==n-1 ){
				if(nums[n-2] ==0)
				return i;
			}else{
				if(nums[n-1] - nums[i] == nums[i-1]) return i;
			}
		}
		return -1;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Solution Obj = new Solution();
        int result = Obj.pivotIndex(arr);
        System.out.println(result);
        sc.close();
    }
}
