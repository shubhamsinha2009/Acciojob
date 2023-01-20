
// QUestion Link -- https://course.acciojob.com/idle?question=0684662d-7d2c-4c63-92f2-bd22db4308ac

import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Solution {

	public static int minPathSum(int[][] grid) {
		int n = grid.length;
        int m = grid[0].length;
        
        for(int i =0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i!=0 || j!=0){
                    int left = 0,up=0;
                    left = i >0 ?grid[i-1][j] : Integer.MAX_VALUE;
                    up = j>0 ?  grid[i][j-1] : Integer.MAX_VALUE;
                     grid[i][j] += Math.min(left,up);
                }
            }
        }

         return grid[n-1][m-1];
	}
}
public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static int[][] take2DInput() throws IOException {
        String[] strRowsCols = br.readLine().trim().split("\\s");
        int mRows = Integer.parseInt(strRowsCols[0]);
        int nCols = Integer.parseInt(strRowsCols[1]);

        if (mRows == 0) {
            return new int[0][0];
        }


        int[][] mat = new int[mRows][nCols];

        for (int row = 0; row < mRows; row++) {
            String[] strNums; 
            strNums = br.readLine().trim().split("\\s");
            
            for (int col = 0; col < nCols; col++) {
                mat[row][col] = Integer.parseInt(strNums[col]);
            }
        }

        return mat;
    }


    public static void main(String[] args) throws NumberFormatException, IOException {
        int[][] mat = take2DInput();
        System.out.println(Solution.minPathSum(mat));
    }
}
