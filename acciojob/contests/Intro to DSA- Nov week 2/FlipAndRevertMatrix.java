
// Question Link - https://course.acciojob.com/idle?question=7cf6dfdb-1831-4311-9385-3899b5e9a278

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                mat[i][j] = sc.nextInt();
        }
        sc.close();
        int[][] res = flipAndInvert(n, mat);
        for (int[] x : res) {
            for (int num : x)
                System.out.print(num + " ");
            System.out.println();
        }
    }

    public static int[][] flipAndInvert(int n, int[][] mat) {

            for(int i =0 ;i<n;i++){
                
                    
                  
                              for(int j=0 ; j<n/2;j++){
                            int temp = mat[i][j];
                            mat[i][j] =mat[i][n-1-j];
                            mat[i][n-1- j] = temp;
                                              mat[i][j] = 1 - mat[i][j];  ; 
                                    
                                  
                                              mat[i][n-j-1] =1- mat[i][n-j-1];
                                  
                                      
                    }
                    if(n%2 !=0){
                           
                                              mat[i][n/2]=1 -  mat[i][n/2];
                                
                    }
                        
                  
                   

                    
            }
            return mat;
    }
}
