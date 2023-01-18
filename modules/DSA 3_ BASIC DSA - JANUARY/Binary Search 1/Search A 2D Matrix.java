
// Question link -- https://course.acciojob.com/idle?question=e469460a-11cf-480b-b950-02efad208e6b

import java.util.*;

public class Main {
    public static boolean SearchA2DMatrix(int[][] matrix, int target) {
           
        int m = matrix.length;
        if(m==0) return false;
        int n = matrix[0].length;
        int low = 0;
        int high = (m*n) -1;

        while(low<=high){
            int mid = (low+high)/2;
                int row = mid/n;
                int col = mid%n;
            if(matrix[row][col] == target) return true;
            else if(matrix[row][col] < target){
                low= mid+1;
            }else{
                high = mid-1;
            }

        }

        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] mat = new int[m][n];
        for(int i = 0; i< m; i++) {
            for(int j = 0; j<n; j++)
                mat[i][j] = sc.nextInt();
        }
        int x = sc.nextInt();
        if(SearchA2DMatrix(mat, x))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
