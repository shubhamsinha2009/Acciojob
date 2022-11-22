
// Question Link --- https://course.acciojob.com/idle?question=dae84631-350d-419f-b7b8-cbbc13ce1eff

import java.io.*;
import java.util.*;

class Solution{

	static int indexOfTargetElementAfterSorting(int[] arr, int n , int target){

		// Divide And Conquer #Binary Search
		// Time Complexity -- O(nlogn)
		// Time Complexity excluding sorting -- O(log(n))
		
		Arrays.sort(arr);

		int start = 0;
		int last = n -1;

		while(start < last ){
			int mid = (last + start)/2;

			if(arr[mid] < target){
				
				start = mid + 1; 
			
			}else{
				last = mid;
			}
	
		}
		return start;
		
		
	}
	
}
public class Main {
    public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int a[] = new int[n];

		for(int i =0 ;i<n;i++){
			a[i] = sc.nextInt();
		}

		int t  = sc.nextInt();

		Solution Obj = new Solution();
       int index =  Obj.indexOfTargetElementAfterSorting(a, n ,t);

		System.out.println(index);

		
    }
}
