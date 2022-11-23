
// Question Link -- https://course.acciojob.com/idle?question=2e44a4b2-25f2-4fba-b95b-302ec00fb872

import java.util.*;
import java.lang.*;
import java.io.*;


class Solution {

	    public void booleanMatrix(int[][] mat, int m , int n) {

			

			// Additional Memory Solution 
			// Time Complexity -- O(m*n)
			// Space Complexity -- O(m)
	
			// additionalMemorySol(mat, m , n);
	
			// Space Efficient Solution
			// Time Complexity -- O(m*n)
			// Space Complexity -- O(1) 
			
			spaceEfficientSol(mat, m , n);

			// It is space efficient approach 
			// than previous because it doesn't
			// take(create) any extra space like
			// previous one does creating a 
			// boolean array of length m
						
		  // Not mentioned Brute Force Solution as 
		  // it will take space O(m*n) same as matrix                
              
	}

	private void additionalMemorySol(int[][] mat, int m , int n){
		boolean containsOne[] = new boolean[m];
                
                for(int i = 0; i < m; i++){
                        for(int j = 0; j < n; j++){
                                if(mat[i][j] == 1){
                                        containsOne[i] = true;
                                }
                        }
                }

                for(int i = 0; i < m; i++){
                        if(containsOne[i] == true){
                                // fill it with 1s
                                for(int j = 0; j < n; j++){
                                        mat[i][j] = 1;
                                }
                        }
                }

	}

	private void spaceEfficientSol(int[][] a, int m , int n){
		 
		for(int i =0;i<m;i++){				
		  for(int j =1; j<n;j++){
				  if(a[i][j] == 1){
						  a[i][0] =1;
						  break;          
				  }             
				}
			}
                
		for(int i =0;i<m;i++){
		  for(int j =0 ; j<n;j++){
				a[i][j] = a[i][0];				  
				}		
			}
                
	}
		
}
			
		
public class Main{
	public static void main (String[] args) throws java.lang.Exception
	{
		  Scanner sc = new Scanner(System.in);
       int m = sc.nextInt();
       int n = sc.nextInt();
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();
		
        Solution Obj = new Solution();
	       Obj.booleanMatrix(matrix, m,n);
		for(int i=0; i<m; i++)
        {   for(int j=0; j<n; j++)
                  {
                       System.out.print(matrix[i][j] + " ");
                  } System.out.println("");
        }
        sc.close();
    }
}

