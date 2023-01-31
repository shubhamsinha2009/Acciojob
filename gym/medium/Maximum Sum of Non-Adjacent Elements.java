
// Question Link - https://course.acciojob.com/idle?question=b5019ff7-c2d6-45d1-92ab-168028dc3c3f

import java.util.*;
class Solution
{
    public static int maximumNonAdjacentSum(int arr[], int n)
    {
	
		int prev1 = arr[0];
		int prev2 = 0;
		int curr = 0; 

		for(int i =1;i<n;i++){
			int inc = prev2 + arr[i];
			int exc = prev1; 
			curr = Math.max(inc,exc);
			prev2 = prev1;
			prev1= curr;
		}
		return prev1;
        
    }

	// public static int h(int arr[],int i, int[] dp){
	// 	if(i<0) return 0;

	// 	if(dp[i]!=-1) return dp[i];
	// 	int inc = h(arr,i-2,dp) + arr[i];
	// 	int exc = h(arr,i-1,dp);

	// 	return dp[i] = Math.max(inc,exc);
	// }
}
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; ++i){
            arr[i] = sc.nextInt();
        }
        System.out.print(Solution.maximumNonAdjacentSum(arr,n));
    }
}
