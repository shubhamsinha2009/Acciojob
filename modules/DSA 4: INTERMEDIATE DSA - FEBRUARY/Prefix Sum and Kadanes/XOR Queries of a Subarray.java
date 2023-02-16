
// Questiomn Link -- https://course.acciojob.com/idle?question=2b47cc50-0795-4f02-83ff-53438d39a9df

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
	  public static void main(String[] args) throws Throwable {
		  Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int q = sc.nextInt();
	        int [] arr= new int[n];
	        for(int i=0;i<n;i++){
	            arr[i]=sc.nextInt();
	        }
	        int [][] queries= new int[q][2];
	        for(int i=0;i<q;i++){
	            for(int j=0;j<2;j++){
	                queries[i][j]=sc.nextInt();
	            }
	        }
	        Solution Obj= new Solution();
	        
	        int [] result = Obj.xorQueries(arr,queries);
	        for(int i=0;i<result.length;i++){
	            System.out.print(result[i]+" ");
	    }
 }
}
class Solution{
  
	 public static int[] xorQueries(int[] A, int[][] queries) {

			 for(int i=1;i<A.length;i++){
				 A[i] ^= A[i-1];
			 }
				int ans[] = new int[queries.length];
			 for(int i=0;i<queries.length;i++){
				 int a = queries[i][0]-1;
				 
				 ans[i] = (a<0 ? 0 : A[a] )^ A[queries[i][1]];
			 }
		 return ans ;
	    }   
}
