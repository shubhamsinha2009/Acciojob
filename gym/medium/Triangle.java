
// Question Link -- https://course.acciojob.com/idle?question=9410043a-5f05-4fac-850c-b8f480b02b13

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] grid = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        Solution s = new Solution();
        System.out.println(s.minimumTotal(grid));
    }

}

class Solution {
    public static int minimumTotal(int[][] triangle) {
		    int m = triangle.length;
        int[] dp = new int[m];
        
        for(int i= m-1;i>=0;i--){{
            for(int j=0;j<=i;j++){
               int min = i==m-1 ? 0: Math.min(dp[j],dp[j+1]);
                dp[j] = triangle[i][j] + min;
            }
         }
        }

        return dp[0];
    }
}
