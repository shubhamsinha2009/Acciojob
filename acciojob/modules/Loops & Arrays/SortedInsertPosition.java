
// Question Link --- https://course.acciojob.com/idle?question=bff80545-9861-4ac9-9c16-e4729299bd09

import java.util.*;
import java.lang.*;
import java.io.*;

class Solution {
   public static int searchInsert(int[] a, int b) {

	   // Brute Force Solution
	   // Time Complexity -- 0(n)
	   // Space Complexity -- 0(1)

	//  return bruteForceSolution(a,b);

	   
	    // Binary Search Solution
	   // Time Complexity -- 0(logn)
	   // Space Complexity -- 0(1)

	   return binarySearchSolution(a,b);
	   
			
		   } 

private static int bruteForceSolution(int[] a, int b){
	
		for(int i =0 ; i<a.length ; i++){

				if(b<= a[i]){
						return i;
				}
		}
			   return a.length;

	}

private static int binarySearchSolution(int[] a, int b){
	 int low =0;
        int high=a.length-1;
        
        while(low<=high){
            
            int mid= low + (high-low)/2;
            
            if(a[mid]==b){
                return mid;
            }else if(a[mid] > b){
                high=mid-1;
            }else{
                low =mid+1;
            }
        }
        

       return high + 1;

	}

	
		} 



public class Main { 
	public static void main(String args[]) { 
		Scanner sc = new Scanner(System.in);

	  int N = sc.nextInt();
	  int[] A = new int[N];
	  for(int i=0;i<N;i++){
      A[i] = sc.nextInt();
		}
	  int B = sc.nextInt();
	  Solution Obj = new Solution();
      
	System.out.println(Obj.searchInsert(A,B));
		  
    
			}
		}
