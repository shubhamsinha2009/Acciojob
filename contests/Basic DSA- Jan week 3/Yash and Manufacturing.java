
// Question Link -- https://course.acciojob.com/idle?question=214e2cb7-953d-43e5-86be-fc81ea622bea

import java.util.*;

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        long ans = Solution.efficientManufacturing(n, k, arr);
        System.out.println(ans);
    }
}
class Solution 
{
    static long efficientManufacturing(int n, int k, int arr[]) 
    {
		
        long low = 1;
		long high = Integer.MIN_VALUE;
		long ans = 0;
		if(n<=0|| k<=0) return 0;
		
		for(int i : arr) high = Math.max(high,i);
		high*=k;

		while(low<=high){
			long mid = (low+high)/2;

			if(isPossible(mid,arr,n,k)){
				ans = mid;
				high = mid-1;
			}else{
				low=mid+1;
			}
		}
		return ans;
		
    }

	public static boolean isPossible(long mid , int[] arr , int n , int k){

		long count =0;
		for(int i :arr){
			count+= (long) (mid/i);
		}

		return count>=k;
	}
}
