
// Question Link -- 

import java.util.*;
import java.lang.*;
import java.io.*;

class Solution{
		static int rishabhTask(int[][] mat){

			// Brute Force Approach
			// Time Complexity -- O(m*n*(m+n))
			// Space Complexity -- O(1)

			// return bruteForce(mat);
			
			// Better Approach 
			// Time Complexity -- O(m*n)
			// Space Complexity -- O(m+n)

			 return betterApproach(mat);
			
		}

	static boolean isSpecial(int row, int column,int[][] mat){
		int n = mat.length;
		int m = mat[0].length;

		int sum = 0;
		for(int i =0 ; i<n;i++){
			sum+= mat[i][column];
	
		}
		for(int i =0 ; i<m;i++){
			sum+= mat[row][i];
			
		}

		return sum==2;
		
	}

	static int bruteForce(int[][] mat){
		
			int n = mat.length;
			int m = mat[0].length;


			int count = 0;
			
			for(int i =0 ; i<n;i++){
				for(int j=0 ; j<m;j++){
					
					
					if(mat[i][j]==1 && isSpecial(i,j,mat)){
						count++;
						
						
					}
	
				}


			}
			return count ;

			
	}
	
	static int betterApproach(int[][] mat){
		
			int n = mat.length;
			int m = mat[0].length;

			int row[] = new int[n];
			int column[] = new int[m];

		
			for(int i =0 ; i<n;i++){
				
				for(int j=0 ; j<m;j++){
					 row[i] += mat[i][j];					
					 column[j] += mat[i][j];

				}

				
			}

			int count = 0;
			
			for(int i =0 ; i<n;i++){
				for(int j=0 ; j<m;j++){
					
					if(mat[i][j]==1 && row[i]==1 && column[j]==1){
						count++;
						
						
					}
	
				}


			}
			return count ;
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
	      int sum = Obj.rishabhTask(matrix);
	
	         System.out.print(sum);
        
        sc.close();
    }
}
