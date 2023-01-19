
// Question link -- https://course.acciojob.com/idle?question=40ad500f-e244-4123-96fa-fb6300ce8eac

import java.io.*;
import java.util.*;

class Solution {
    static int rowWithMaximumOnes(int arr[][], int n, int m) {
		// O(m+n)

		int maxCol = m-1;
		int maxRow = -1;
		for(int i=0;i<n;i++){

			while(maxCol>=0 && arr[i][maxCol]==1){
				maxRow = i;
				maxCol--;
			}	
		}
		return maxRow;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,m;
        n = sc.nextInt();
        m = sc.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        Solution s = new Solution();
        System.out.println(s.rowWithMaximumOnes(arr,n,m));
        
    }
}
