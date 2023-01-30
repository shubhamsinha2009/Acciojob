
// Question Link -- https://course.acciojob.com/idle?question=72deea09-20ef-423b-a71a-581ffb807728

import java.util.*;

class Solution {
    public int distribution(int n, int[] nums,int k) {
		int sum = 0;
		int a = nums[k];
		for(int i=0;i<n;i++){
			int num = nums[i];
			int x = (i<=k)?0:1;
				if(num>=a)sum += a - x;
				else sum+=num;
			
		}
		return sum;
    }
}
public class Main{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
         int k = sc.nextInt();
        sc.close();
        Solution Obj = new Solution();
		int a=Obj.distribution(n,arr,k);
        System.out.print(a+" ");
		}
}
