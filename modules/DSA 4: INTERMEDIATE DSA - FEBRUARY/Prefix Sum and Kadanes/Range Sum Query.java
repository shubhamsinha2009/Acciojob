
// Question Link -- https://course.acciojob.com/idle?question=51efaeab-1411-48fc-ae36-d2d70cad0edd

import java.util.*;

class Solution {
        public int[] sumQuery(int[] arr, int[][] ranges) {

			for(int i =1;i<arr.length;i++){
				arr[i] += arr[i-1];
			}

			int[] ans = new int[ranges.length];
			int i =0;
			for(int[] range : ranges ){
				ans[i++] = arr[range[1]] - ((range[0]==0)?0:arr[range[0]-1]);
			}
			return ans;
        }
}

public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int m;
        m = sc.nextInt();
        int[][] ranges = new int[m][2];
        for(int i = 0; i < m; i++) {
            ranges[i][0] = sc.nextInt();
            ranges[i][1] = sc.nextInt();
        }
        Solution Obj = new Solution();
        int[] ans = Obj.sumQuery(arr, ranges);
        for(int i =0; i< ans.length; i++)
            System.out.print(ans[i] + " ");
    }
}
