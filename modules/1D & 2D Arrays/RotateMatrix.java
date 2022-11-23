
// Question Link --- https://course.acciojob.com/idle?question=dddfc300-2739-4bd4-bf5e-c4e8a24f73d8

import java.io.*;
import java.util.*;

class Solution {
    public int[][] rotateBy90(int [][]mat) {

		int n = mat.length;


		// Brute Force Solution 

		// Time Complexity -- O(n^2)
		// Space Complexity -- O(n^2)

		return bruteForceSol(mat,n);

		
		// Optimised Solution 
		// Reduced Space Complexity
		// Time Complexity -- O(n^2)
		// Space Complexity -- O(1)

		
		// transpose(mat,n);
		// reverse(mat,n);
		// return mat;
		
    }

	private int[][] bruteForceSol(int[][] mat,int n){
		
		int rotated[][] = new int[n][n];
	
         for(int i =0 ;i<n ;i++){
      for(int j=0;j<n;j++){

		   rotated[j][n - i - 1] = mat[i][j];
        
      }
           
    }
		return rotated;
		

		
	}

	private void transpose(int[][] mat,int n){

		for(int i =0 ; i<n-1;i++){
			for(int j =i+1 ; j< n;j++){
			
			// swap elements 
				int temp = mat[i][j];
				mat[i][j]= mat[j][i];
				mat[j][i] = temp;
				
			}

		}
		
	}

	private void reverse(int[][] mat,int n){
		
		for(int i =0 ; i<n;i++){
			for(int j =0 ; j< n/2;j++){
			
			// swap elements 
				int temp = mat[i][j];
				mat[i][j]= mat[i][n-1-j];
				mat[i][n-1-j] = temp;
				
			}

		}
	}
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();
        int [][]mat=new int[n][m];
        for(int i=0;i<n;++i){
            for(int j=0;j<m;++j){
                mat[i][j]=sc.nextInt();
            }
        }
        Solution Obj = new Solution();
        int[][] rotated =Obj.rotateBy90(mat);
		
		for(int i =0; i<rotated.length;i++){
			for(int j =0 ; j<rotated[0].length;j++){

				System.out.print(rotated[i][j] + " ");

				
			}	
			   System.out.println();
		}


    }
}
