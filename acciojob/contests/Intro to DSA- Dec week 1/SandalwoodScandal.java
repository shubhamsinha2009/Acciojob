
// Question Link -- https://course.acciojob.com/idle?question=64b8de3a-5299-4183-9357-ac2831991c63

import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputLine;
        inputLine = br.readLine().trim().split(" ");
        int n = Integer.parseInt(inputLine[0]);
        int m = Integer.parseInt(inputLine[1]);


        int[][] grid = new int[n][m];
        for(int i=0; i<n; i++){
          String inputLine1[] = br.readLine().trim().split(" ");
          for(int j=0; j<m; j++){
            grid[i][j]=Integer.parseInt(inputLine1[j]);
          }
        }

        Solution g = new Solution();
        g.divisiblePaths(n, m, grid);
  }
}

class Solution
{
    void divisiblePaths(int m, int n, int[][] grid){

			divisiblePath(0,0,m-1,n-1,grid,0,"");
		
	   
    }

	void divisiblePath(int i,int j, int m ,int n,int[][] grid,int sum,String ans){

		if(i>m|| j>n || grid[i][j] == -1 )return ;
		if(i==m && j==n ){
				sum+=grid[i][j];
				if(sum%5==0) System.out.println(ans);  
			return;
		}

		divisiblePath(i,j+1,m,n,grid,sum+grid[i][j],ans+"h");
		divisiblePath(i+1,j+1,m,n,grid,sum+grid[i][j],ans+"d");
		divisiblePath(i+1,j,m,n,grid,sum+grid[i][j],ans+"v");
		
	}
	
} 

