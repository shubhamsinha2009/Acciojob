
// Question Link -- https://course.acciojob.com/idle?question=09b7009d-eb26-4479-a937-ab55d1e0d784

import java.util.*;
import java.lang.*;
import java.io.*;

class Solution {
    public long MinimumPages(int[] A, int B) {
		if (A.length < B) {
			return -1;
		}

		long low = 0;
		long high = 0;

		for(int i : A){
			high+= i;
			low=Math.max(low,i);
		}

		long ans = -1;

		while(low<=high){
			long mid = (low+high)/2;

			if(isPossible(A,B,mid)){
				ans = mid;
				high = mid-1;
			}else{
				low = mid+1;
			}
		}

		return ans ;
    }

	public static boolean isPossible(int[] A, int B,long mid){
		long count =1;
		long sum =0;
			for(int i:A){
					sum+= i;
					if(sum > mid){
						count++;
						sum=i;
					}
			}

		return count <=B;
	}
}

class Main {
    

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
	    
	    int N = sc.nextInt();
	    int B = sc.nextInt();
        int[] A = new int[N];
        for(int i=0;i<N;i++)
            A[i] = sc.nextInt();

        Solution Obj = new Solution(); 
        System.out.println(Obj.MinimumPages(A,B));
	}
}
