
// Question Link - https://course.acciojob.com/idle?question=b713e4d2-2d59-4ba5-9b6c-e45ef1c55b3f

import java.util.*;

class Solution {
    public int findMaxScore(int[][] a) {

		int m = a.length;
		int n = a[0].length;
		int max = Integer.MIN_VALUE;

		for(int i = 1; i<m-1;i++){
			for( int j =1 ; j<n-1;j++){
				
				int p1 = a[i-1][j-1];
				int p2 = a[i-1][j];
				int p3 = a[i-1][j+1];
				int p4 = a[i][j];
				int p5 = a[i+1][j-1];
				int p6 = a[i+1][j];
				int p7 = a[i+1][j+1];
				int sum = p1+p2+p3+p4+p5+p6+p7;
			max = Math.max(max,sum);
				
			}
		}
		return max;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;
        m = sc.nextInt();
        n = sc.nextInt();
        int[][] a = new int[m][n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                a[i][j] = sc.nextInt();
        Solution Obj = new Solution();
        int score = Obj.findMaxScore(a);
        System.out.println(score);
        sc.close();
    }
}
