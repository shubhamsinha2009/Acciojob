
// Question Link -- https://course.acciojob.com/idle?question=a830760b-ef7a-420a-b89c-91d5acdafeeb

import java.util.*;

class Solution{
    public static int UniquePaths2(int m,int n,int[][] obstacleGrid){
         if(m<n) {
            int temp =m;
            m=n;
            n=temp;
        }
       double res = 1;
        
        for (int i = 1; i <= n-1; i++) {
            res = res * (m-1+i) / i;
          
        }
        return (int)res;
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
