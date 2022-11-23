
// Question Link -- https://course.acciojob.com/idle?question=4898baf8-ed87-4c99-a19d-64bc7e98638e

import java.io.*;
import java.util.*;

class Solution {
    public void spirallyTraverse(int [][]mat) {
         int r = mat.length;
        int c = mat[0].length;
        // Define the boundaries
        // Right: Print top row, from left to right
        // Down: Print right column, from top to bottom
        // Left: Print the bottom row, from right to left
        // Up: Print the left column, from bottom to top
        int top = 0, bottom = r - 1;
        int left = 0, right = c - 1;
    
        while(top <= bottom && left <= right){
          
                // row is fixed as top row
                // Move from left to Right
                for(int i = left; i <= right; i++){
                    System.out.print(mat[top][i] + " ");
                }
                top++; // as we have printed every element at top row
          
        
                // column is fixed as the right column
                // Move from top to bottom
                for(int i = top; i <= bottom; i++){
                    System.out.print(mat[i][right] + " ");
                }
                right--;// as we have printed all elements at right col
            
            if(top > bottom || left > right) break;
            
                // row is fixed at the bottom row
                // Move from right col to left col
                for(int i = right; i >= left; i--){
                    System.out.print(mat[bottom][i] + " ");
                }
                bottom--;// as we have printed all elements at bottom row
       
           
                // col is fixed at the left col
                // Move from bottom to top
                for(int i = bottom; i >= top; i--){
                    System.out.print(mat[i][left] + " ");
                }
                left++;// as we have printed all elements at left col
       
        
        
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
        Obj.spirallyTraverse(mat);  
        System.out.println('\n');
    }
}
