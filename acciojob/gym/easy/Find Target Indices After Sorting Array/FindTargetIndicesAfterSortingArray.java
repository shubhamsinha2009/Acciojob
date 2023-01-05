
// Question Link -- https://course.acciojob.com/idle?question=181fd699-05a1-4f9a-9618-c8a04afb3b2e

import java.io.*;
import java.util.*;

class Solution{

	static void indexOfTargetElementAfterSorting(int[] arr, int n , int target){

		// Divide And Conquer #Binary Search
		// Time Complexity -- O(nlogn)
		// Time Complexity excluding sorting -- O(log(n))
		
		Arrays.sort(arr);

		int start = 0;
		int last = n -1;

		while(start <= last ){
			int mid = (last + start)/2;

			if(arr[mid] < target){
				
				start = mid + 1; 
			
			} else if(arr[mid]== target){				
				while(mid>=0 && mid<n && arr[mid]==target){
					mid--;
				};
				mid++;
				while(mid>=0 && mid<n && arr[mid]==target){
				System.out.print(mid + " ");
					mid++;
				}
				
				return;
			}
			else{
				last = mid - 1;
			}
	
		}
		
		System.out.print("-1");
		
	}
	
}
public class Main {
    public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t  = sc.nextInt();

		int a[] = new int[n];
		

		for(int i =0 ;i<n;i++){
			a[i] = sc.nextInt();
		}

	

		Solution Obj = new Solution();
      Obj.indexOfTargetElementAfterSorting(a, n ,t);

	

		
    }
}
