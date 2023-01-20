
// Question Link -- https://course.acciojob.com/idle?question=a830760b-ef7a-420a-b89c-91d5acdafeeb

import java.util.*;

class Solution{
    public static int UniquePaths2(int m,int n,int[][] obstacleGrid){

        for(int i =0;i<m;i++){
            for(int j =0;j<n;j++){
                if(obstacleGrid[i][j] == 1) obstacleGrid[i][j] = 0;
                else if(i==0 && j==0)obstacleGrid[i][j] = 1;
                else{
                    int left =0;
                    int up =0;
                    if(i>0) left = obstacleGrid[i-1][j];
                    if(j>0) up = obstacleGrid[i][j-1];
                    obstacleGrid[i][j] = left + up;
                }              
            }
        }
        return obstacleGrid[m-1][n-1];
    }
}

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] obstacleGrid = new int[m][n];
        for(int i=0;i<m;++i){
            for(int j=0;j<n;++j){
                obstacleGrid[i][j]=sc.nextInt();
            }
        }
        Solution obj = new Solution();
        int ans = obj.UniquePaths2(m,n,obstacleGrid);
        System.out.println(ans);
    }
}
