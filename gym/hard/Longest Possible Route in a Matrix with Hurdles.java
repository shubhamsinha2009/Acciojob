
// Question Link -- https://course.acciojob.com/idle?question=07f64edb-63a1-49c7-9929-042ad7eda233

import java.util.*;

public class Main {



  static int findLongestPath(int mat[][], int i, int j, int x, int y, int R, int C) {
    
	  int[] ans = new int[]{-1};

		helper( mat,x,y,0,ans);

	  return ans[0];
  }

	static void helper(int mat[][], int row, int col,int count,int[] ans){
		int m = mat.length;
		int n = mat[0].length;
		if(row<0||col<0|| row>=m || col>= n || mat[row][col] == 0 ) return;

		if(row==0 && col==0){
			ans[0] = Math.max(ans[0],count);
			return;
		}

		mat[row][col] = 0;
		
		helper(mat,row - 1,col,count+1,ans);
		helper(mat,row + 1,col,count+1,ans);
		helper(mat,row,col-1,count+1,ans);
		helper(mat,row,col+1,count+1,ans);

		mat[row][col] = 1;	
	}
  // Driver Code
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int R = sc.nextInt(), C = sc.nextInt();
    int[][] mat = new int[R][C];
    for (int i = 0; i < R; i++) {
      for (int j = 0; j < C; j++) {
        mat[i][j] = sc.nextInt();
      }
    }
    int dest_x = sc.nextInt(), dest_y = sc.nextInt();
    sc.close();
    System.out.println(findLongestPath(mat, 0, 0, dest_x, dest_y, R, C));
  }
}
