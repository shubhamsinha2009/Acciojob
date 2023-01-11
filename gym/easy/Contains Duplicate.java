
// Question Link -- https://course.acciojob.com/idle?question=00744049-8dcb-4429-8ae0-f3607545f1a5

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];

    for(int i =0;i<n;i++){
      arr[i]=sc.nextInt();
    }

	// Simple Solution without using functions 
	// and boolean is duplicate 
	// Time Complexity -- O(n^2)
	// Space Complexity -- O(1) (no extra space)
	// not considering array space 

	
 //    for(int j=0; j<n - 1 ; j++){
 //     for(int i = j+1;i<n;i++){
 //       if(arr[i] == arr[j]){
 //      System.out.println(true);
 //       System.exit(0);
 //       }
 //    }
 //    }
	// System.out.println(false);

		// using  functions

		// Brute Force Solution
	
	//	System.out.println(bruteSol(arr,n)); 

		// After Sorting Solution

		//System.out.println(afterSortingSol(arr,n)); 

		// HashSet Solution
		// Time Complexity -- O(n)
		// Space Complexity -- O(1) 
		
		 System.out.println(hashsetSol(arr,n)); 
		
		
    
	}

	public static boolean bruteSol(int[] arr , int n) {

		// Time Complexity -- O(n^2)
		// Space Complexity -- O(1) 
	
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                if(arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

	
	public static boolean afterSortingSol(int[] arr , int n) {

		// Time Complexity -- O(nlogn)
		// Space Complexity -- O(1) 

			Arrays.sort(arr);
       
		for(int i = 1; i <n; i++) {
           
                if(arr[i] == arr[i-1]) {
                    return true;
                }
           
        }
        return false;
    }

	public static boolean hashsetSol(int[] arr , int n){


	  HashSet<Integer> check = new HashSet<>();
      
       for(int i =0 ; i<n;i++){
          if(!check.add(arr[i])) return true ;
        }
           return false;


		
	}
	
}
