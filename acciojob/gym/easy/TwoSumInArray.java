
// Question Link : https://course.acciojob.com/idle?question=1fb1edd7-9b93-4d5e-9108-3484e8afe20b

import java.util.*;
import java.lang.*;
import java.io.*;

class Solution{
	public static int[] twoSumInArray (int[] a, int n , int target){

		// Brute Force Solution 
		// Time Complexity -- O(n^2)
		// Space Complexity = O(1)
		
		// return bruteSolution(a,n,target);

		// Sorting Solution
		// Time Complexity -- O(nlogn)
		// Space Complexity - O(n)
		
		// return sortingSolution(a,n,target);

		// 

		return hashMapSolution(a,n,target);
	}

	private static int[] bruteSolution(int[] a, int n , int target ){
 
		for(int i =0; i<n-1;i++){
				for(int j=i+1 ; j<n;j++ ){
		
					if(a[i] + a[j] == target){
					
					   return new int[]{i , j} ;
					 }; 
				  }
				}
		return null;
	}

	private static int[] sortingSolution(int[] a, int n , int target){
		
		int b[] = Arrays.copyOf(a,n);
		Arrays.sort(b);

		int start = 0;
		int end = n-1;

		while(start<end){
			int sum = b[start]+b[end];

			if(sum<target){
				start++;
			} else if(sum>target){
				end--;
			}else{
				break;
			}
		}

		int ans[] = new int[2];
		
		for(int i =0 , j =0 ; i< n && j<2;i++){
			
			if(b[start] == a[i] || b[end] == a[i] ){
				ans[j++] = i;
			}
			
		}
		return ans;
		
	}

	private static int[] hashMapSolution(int[] a, int n , int target){

		HashMap<Integer, Integer> hash = new HashMap<>();

		for(int i =0 ; i<n;i++){

			int difference = target - a[i];
			if(hash.containsKey(difference)){
				return new int[]{hash.get(difference) , i};
			}

			hash.put(a[i],i);
		}
		return null;
	}
 }
public class Main{
	public static void main (String[] args) throws java.lang.Exception{
	Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
			int target = sc .nextInt();
			
			int a[] = new int[n];
		
			for(int i = 0 ; i<n ; i++)
					a[i] = sc.nextInt();

				Solution sol = new Solution();
				int[] ans= sol.twoSumInArray(a,n,target);

					System.out.print(ans[0] + " " + ans[1]);
				
			

			}
		}
