
// Question Link -- https://course.acciojob.com/idle?question=b13fd5f5-82f1-4d2a-af77-e96cbaa9c329

import java.util.*;

class Solution {
    public static int minDifference(int[] arr, int key) {
       int low = 0;
		int n = arr.length;
		int high = n-1;

		int diff = Integer.MAX_VALUE;
		int ans =-1;
		while(low<=high){
			int mid = (low+high)/2;
			 int d= Math.abs(arr[mid] - key);
				if(d<diff){
					diff = d;
					ans= arr[mid];
				}
				
			if(diff==0) return arr[mid];
			else if(arr[mid]>key){
				high=mid-1;
			}else{
				low=mid+1;
			}
		}
		return ans;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        int n = input.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = input.nextInt();
        }
        Solution obj= new Solution();
        System.out.println(obj.minDifference(a,k));
    }
}
