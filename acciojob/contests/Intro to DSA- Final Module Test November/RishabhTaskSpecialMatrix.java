
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

			// return betterApproach(mat);
           		 // return betterOnePass(mat);

           		 // Space Efficient Approach 
			// Time Complexity -- O(m*n)
			// Space Complexity -- O(1)

            return spaceEfficientApproach(mat);
			
			
		}

static int spaceEfficientApproach(int[][] mat){
		
			int n = mat.length;
			int m = mat[0].length;

            int columnIndex0 = -1;   
			for(int i =0 ; i<n;i++){
                int columnIndex = -1 ;
                int rowSum = 0;
				for(int j=0 ; j<m;j++){
					if(mat[i][j]==1 ){
                      if(i > 0) mat[0][j]++ ;
                        rowSum++;
                        columnIndex = j;                         
                    }                         
				}

                 if(rowSum != 1) columnIndex =-1;
                 if(i!=0) mat[i][0] = columnIndex ;
                 else columnIndex0 =columnIndex;
                 
            } 
            int sum = 0;

            if(columnIndex0 >=0 && mat[0][columnIndex0] == 1) sum++ ;    

            for(int i=1 ; i<n ;i++ ){

                if(mat[i][0]>= 0 && mat[0][mat[i][0]] == 1 ) sum++;
            }
            return sum ;
	
	}

    static int betterOnePass(int[][] mat) {
        final int n = mat.length, m = mat[0].length;
        final int[] rows = new int[n], cols = new int[m];
       
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 1) {
                    rows[i] = rows[i] == 0 ? j + 1 : -2;
                    cols[j] = cols[j] == 0 ? i + 1 : -2;
                }
            }
        }
        
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (rows[i] > 0 && cols[rows[i] - 1] > 0) {
                cnt++;
            }
        }
        return cnt;
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
