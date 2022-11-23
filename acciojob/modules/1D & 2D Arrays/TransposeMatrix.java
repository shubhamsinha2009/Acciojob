
// Questions Link -- https://course.acciojob.com/idle?question=8bd8b45a-d71c-4878-bbab-8c531d3ef27a

import java.util.*;
import java.io.*;

class Solution {
    public int[][] matrixTranspose(int[][] mat, int n) {

           for(int i =0;i<n-1;i++){
        for(int j =i+1 ;j<n;j++){

            int swap = mat[i][j];
            mat[i][j] = mat[j][i];
            mat[j][i] = swap;
        }

      
      }
         return mat;
       
}
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();
        Solution Obj = new Solution();
        int[][] ans = Obj.matrixTranspose(matrix, n);
        for(int i=0; i<n; i++)
        {   for(int j=0; j<n; j++)
                  {
                       System.out.print(ans[i][j] + " ");
                  } System.out.println("");
        }
        sc.close();
    }
}
